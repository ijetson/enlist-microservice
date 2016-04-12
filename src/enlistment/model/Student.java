package enlistment.model;

import java.sql.Date;

public class Student {

	private long id;
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String course;
	private boolean isGraduate;
	private boolean isRtnStudent;
	private String lastModBy;
	private Date lastModDate;

	public long getId() {
		return id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public boolean isRtnStudent() {
		return isRtnStudent;
	}

	public void setRtnStudent(boolean isRtnStudent) {
		this.isRtnStudent = isRtnStudent;
	}

	public String getLastModBy() {
		return lastModBy;
	}

	public void setLastModBy(String lastModBy) {
		this.lastModBy = lastModBy;
	}

	public Date getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Date lastModDate) {
		this.lastModDate = lastModDate;
	}

	public void setId(long id) {
		this.id = id;
	}

}
