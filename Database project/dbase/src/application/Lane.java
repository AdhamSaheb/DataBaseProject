package application;

public class Lane {
	String name; 
	String start;
	String des;
	float price;
	float duration;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public Lane(String name, String start, String des, float price, float duration) {
		super();
		this.name = name;
		this.start = start;
		this.des = des;
		this.price = price;
		this.duration = duration;
	}
	
}
