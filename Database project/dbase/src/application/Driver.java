package application;

import java.util.Date;

public class Driver {
	
	String DID;
	String DName;
	Date startDate;
	
	public Driver(String dID, String dName, Date startDate) {
		super();
		DID = dID;
		DName = dName;
		this.startDate = startDate;
	}
	public String getDID() {
		return DID;
	}
	public void setDID(String dID) {
		DID = dID;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	

}
