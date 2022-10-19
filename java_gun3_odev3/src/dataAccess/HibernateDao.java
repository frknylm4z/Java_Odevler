package dataAccess;

public class HibernateDao implements CourseDao,CategoriesDao{

	@Override
	public void addCourse() {
		System.out.println("Hibernate database kullanılarak kurs eklendi");
	}

	@Override
	public void deleteCourse() {
		
	}

	@Override
	public void addCategory() {
		System.out.println("Hibernate database kullanılarak kategori silindi");
	}

	@Override
	public void deleteCategory() {
		
	}


}
