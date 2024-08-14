package car.pojo;

public class Tyre {
	
	private int size = 17;
	private String manfu = "khan tyre";
	private int price = 140;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getManfu() {
		return manfu;
	}
	public void setManfu(String manfu) {
		this.manfu = manfu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tyre [size=" + size + ", manfu=" + manfu + ", price=" + price + "]";
	}
	
	
}
