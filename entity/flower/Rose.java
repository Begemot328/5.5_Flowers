package by.module5.task5.entity.flower;

public class Rose extends Flower {
	private static FlowerType type;
	
	static {
		type = FlowerType.ROSE;
	}
	
	public Rose(double price) {
		super(price);
	}
	
	public Rose(double price, String ccomment) {
		super(price, ccomment);
	}

	public String toString() {
		String result;
		result = FLOWER + " " + type.toString() + " " + getPrice();
		return result;
	}
}
