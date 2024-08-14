package car.pojo;

public class Car {

	private String make;
	private String model;
	private int price;
	
	private Engine engine;
	private Tyre tyre;
	private Speaker speaker;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", engine=" + engine + ", tyre=" + tyre
				+ ", speaker=" + speaker + "]";
	}
	
	
}
