package application;

public class TimeTableClass {
	
	String day ; 
	
	String Dname ; 

	String Lname ; 
	
	String Pnum ; 
	
	int ratio ; 
	
	String Time ;
	
	

public TimeTableClass(String day, String dname, String lname, String pnum, int ratio, String time) {
		
		this.day = day;
		Dname = dname;
		Lname = lname;
		Pnum = pnum;
		this.ratio = ratio;
		Time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getPnum() {
		return Pnum;
	}

	public void setPnum(String pnum) {
		Pnum = pnum;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	} 
	
	
	
	

}
