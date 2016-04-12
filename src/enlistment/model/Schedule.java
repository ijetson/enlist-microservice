package enlistment.model;

import java.sql.Date;

public class Schedule {
	
	private long Id;
	private Date date;
	private String LastModBy;
	private Date LastModDate;
	

	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
