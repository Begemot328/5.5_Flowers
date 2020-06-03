package by.module5.task5.entity.flower;

public class Daffodil extends Flower {
	private static FlowerType type;
	
	static {
		type = FlowerType.DAFFODIL;
	}
	
	public Daffodil(double price) {
		super(price);
	}
	
	public Daffodil(double price, String ccomment) {
		super(price, ccomment);
	}

	public String toString() {
		String result;
		result = FLOWER + " " + type.toString() + " " + getPrice();
		return result;
	}
}
