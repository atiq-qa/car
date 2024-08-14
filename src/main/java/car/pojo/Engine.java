package car.pojo;

public class Engine {

	private String type = "V6";
	private String hp = "600hp";
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", hp=" + hp + "]";
	}
	
	
}
