package application;

public class Bus {
	
	String platenum;
	String ownerco;
	float discount;
	String symbol;
	int capacity;
	public String getPlatenum() {
		return platenum;
	}
	public void setPlatenum(String platenum) {
		this.platenum = platenum;
	}
	public String getOwnerco() {
		return ownerco;
	}
	public void setOwnerco(String ownerco) {
		this.ownerco = ownerco;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Bus(String platenum, String ownerco, float discount, String symbol, int capacity) {
		super();
		this.platenum = platenum;
		this.ownerco = ownerco;
		this.discount = discount;
		this.symbol = symbol;
		this.capacity = capacity;
	}
	

}
