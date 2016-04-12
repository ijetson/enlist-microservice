package enlistment.model;

import java.sql.Date;

public class Room {
	
	private long RoomId;
	private String LastModBy;
	private Date LastModDate;
	public long getRoomId() {
		return RoomId;
	}
	public void setRoomId(long roomId) {
		RoomId = roomId;
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
