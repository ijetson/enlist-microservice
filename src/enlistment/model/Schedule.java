package enlistment.model;

import java.sql.Date;

public class Schedule {
	
	private Integer Id;
	private Date date;
	private String LastModBy;
	private Date LastModDate;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
