package enlistment.model;

import java.sql.Date;

public class Subject {
	
	private long subjectId;
	private long CourseId;
	private String Subject;
	private String Code;
	private String Description;
	private Integer InstructorId;
	private Integer RoomId;
	private Integer ScheduleId;
	private Integer Limit;
	private String LastModBy;
	private Date LastModDate;

	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
	public long getCourseId() {
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
	
	public Integer getLimit() {
		return Limit;
	}
	public void setLimit(Integer limit) {
		Limit = limit;
	}
	public void setScheduleId(Integer scheduleId) {
		ScheduleId = scheduleId;
	}
	public String getLastModBy() {
		return LastModBy;
	}
	public void setLastModBy(String lastModBy) {
		this.LastModBy = lastModBy;
	}
	public Date getLastModDate() {
		return LastModDate;
	}
	public void setLastModDate(Date lastModDate) {
		this.LastModDate = lastModDate;
	}
	
	
	

}
