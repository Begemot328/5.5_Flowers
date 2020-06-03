package by.module5.task5.entity.flower;

public class Violet extends Flower {
	private static FlowerType type;
	
	static {
		type = FlowerType.VIOLET;
	}
	
	public Violet(double price) {
		super(price);
	}
	
	public Violet(double price, String ccomment) {
		super(price, ccomment);
	}

	public String toString() {
		String result;
		result = FLOWER + " " + type.toString() + " " + getPrice();
		return result;
	}
}
