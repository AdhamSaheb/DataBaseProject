package application;

public class Ford {
	
	String platenum;
	String Symbol;
	int capacity;
	String asslane;


	public String getAsslane() {
		return asslane;
	}

	public void setAsslane(String asslane) {
		this.asslane = asslane;
	}

	public Ford(String platenum, String symbol, int capacity, String asslane) {
		this.platenum = platenum;
		Symbol = symbol;
		this.capacity = capacity;
		this.asslane = asslane;
	}
	
	public String getPlatenum() {
		return platenum;
	}
	public void setPlatenum(String platenum) {
		this.platenum = platenum;
	}
	public String getSymbol() {
		return Symbol;
	}
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

}
