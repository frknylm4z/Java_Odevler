package dataAccess;

public class JdbcDao implements CourseDao,CategoriesDao{

	@Override
	public void addCourse() {
		System.out.println("Jdbc database kullanılarak kurs eklendi");
	}

	@Override
	public void deleteCourse() {
		
	}

	@Override
	public void addCategory() {
		System.out.println("Jdbc database kullanılarak kategori silindi");
	}

	@Override
	public void deleteCategory() {
		
	}


}