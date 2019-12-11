package application;

import java.util.Date;

public class License {
	
	
	String ID ; 
    Date dateOfIssue ; 
    Date dateOfExpiry ;
    String DID ; 
    
    


public License(String name, Date dateOfIssue, Date dateOfExpiry, String DID) {
		super();
		this.ID = name;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.DID = DID ;
	}




public String getDID() {
	return DID;
}




public void setDID(String dID) {
	DID = dID;
}




public String getID() {
	return ID;
}




public void setID(String iD) {
	ID = iD;
}




public Date getDateOfIssue() {
	return dateOfIssue;
}




public void setDateOfIssue(Date dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}




public Date getDateOfExpiry() {
	return dateOfExpiry;
}




public void setDateOfExpiry(Date dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}





}
