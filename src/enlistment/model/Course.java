package enlistment.model;

import java.sql.Date;

public class Course {
	
	private long courseId;
	private String CourseCode;
	private String CoursName;
	private String CourseDept;
	private String LastModBy;
	private Date LastModDate;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	public String getCoursName() {
		return CoursName;
	}
	public void setCoursName(String coursName) {
		CoursName = coursName;
	}
	public String getCourseDept() {
		return CourseDept;
	}
	public void setCourseDept(String courseDept) {
		CourseDept = courseDept;
	}
	public String getLastModBy() {
		return LastModBy;
	}
	public void setLastModBy(String lastModBy) {
		LastModBy = lastModBy;
	}
	public Date getLastModDate() {
		return LastModDate;
	}
	public void setLastModDate(Date lastModDate) {
		LastModDate = lastModDate;
	}
	
	

}
