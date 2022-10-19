package institues;

import java.util.ArrayList;
import java.util.List;
import entities.CourseInfo;
import core.logging.Logger;
import dataAccess.CourseDao;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	List<String> courseName = new ArrayList<String>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.loggers = loggers;
		this.courseDao = courseDao;
	}

	public void addCourses(CourseInfo courseInfo) throws Exception {

		// ArrayList Icindeki Course Isimlerini Dongu Icinde Tarama Yapiyoruz
		for (String courseCheckName : courseName) {

			// Girilen Category Ismi Ile Var Olan Category Ismini Karsilastiriyoruz
			if (courseCheckName == courseInfo.getCourseName()) {

				// Karsilastirilan Degerler Ayni Ise Hata Veriyor
				throw new Exception("Bu kurs adı kullanılmakta");
			}
		}

		if (courseInfo.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz !");
		}

		courseName.add(courseInfo.getCourseName());

		courseDao.addCourse();

		for (Logger logger : loggers) {
			logger.log(courseInfo.getCourseName() + courseInfo.getTeacherName() + courseInfo.getPrice());
		}
	}

	public void deleteCourses(CourseInfo coursesInfo) {
		System.out.println("Deleted Course");
	}

}
