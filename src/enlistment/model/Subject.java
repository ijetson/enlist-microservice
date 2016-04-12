package enlistment.model;

import java.sql.Date;

public class Subject {
	
	private Integer subjectId;
	private Integer CourseId;
	private String Subject;
	private String Code;
	private String Description;
	private Integer InstructorId;
	private Integer RoomId;
	private Integer ScheduleId;
	private String LastModBy;
	private Date LastModDate;

	
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public Integer getCourseId() {
		return CourseId;
	}
	public void setCourseId(Integer courseId) {
		CourseId = courseId;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Integer getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(Integer instructorId) {
		InstructorId = instructorId;
	}
	public Integer getRoomId() {
		return RoomId;
	}
	public void setRoomId(Integer roomId) {
		RoomId = roomId;
	}
	public Integer getScheduleId() {
		return ScheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
		ScheduleId = scheduleId;
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
	
	
	

}
