package car.pojo;

public class Speaker {
	
	private String manuf = "JBL";
	private int price = 100;
	public String getManuf() {
		return manuf;
	}
	public void setManuf(String manuf) {
		this.manuf = manuf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Speaker [manuf=" + manuf + ", price=" + price + "]";
	}
	
	
}
