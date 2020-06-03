package by.module5.task5.entity.flower;

public class Orchid extends Flower {
	private static FlowerType type;
	
	static {
		type = FlowerType.ORCHID;
	}
	
	
	public Orchid(double price) {
		super(price);
	}
	
	public Orchid(double price, String ccomment) {
		super(price, ccomment);
	}

	public String toString() {
		String result;
		result = FLOWER + " " + type.toString() + " " + getPrice();
		return result;
	}
}
