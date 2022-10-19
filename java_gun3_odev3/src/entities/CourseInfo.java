package entities;

public class CourseInfo {
	public int id;
	public String courseName;
	public String time;
	public String teacherName;
	public double price;
	
	public CourseInfo() {
		
	}
	
	public CourseInfo(int id, String courseName, String time, String teacherName, double price) {
		
		this.id = id;
		this.courseName = courseName;
		this.time = time;
		this.teacherName=teacherName;
		this.price = price;
	}

	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
