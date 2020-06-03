package by.module5.task5.entity.flower;

public class Tulip extends Flower {
	private static FlowerType type;
	
	static {
		type = FlowerType.TULIP;
	}
	
	public Tulip(double price) {
		super(price);
	}
	
	public Tulip(double price, String ccomment) {
		super(price, ccomment);
	}

	public String toString() {
		String result;
		result = FLOWER + " " + type.toString() + " " + getPrice();
		return result;
	}
}
