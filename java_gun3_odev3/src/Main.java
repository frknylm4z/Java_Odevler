
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateDao;
import entities.CategoriesInfo;
import entities.CourseInfo;
import institues.CategorieManager;
import institues.CourseManager;


public class Main {

	public static void main(String[] args) throws Exception {
		
		CourseInfo courseInfo = new CourseInfo();
		Logger[] loggers = {new DataBaseLogger(), new FileLogger ()};
		
		
		CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
		courseManager.addCourses(courseInfo);
		courseManager.deleteCourses(courseInfo);
		
		
		CategoriesInfo categorieInfo = new CategoriesInfo(1,"Back-End Programming");
		
		CategorieManager categorieManager = new CategorieManager(new HibernateDao(), loggers);
		categorieManager.addCategory(categorieInfo);
		categorieManager.deleteCategory(categorieInfo);
		
		
		
	}

}
