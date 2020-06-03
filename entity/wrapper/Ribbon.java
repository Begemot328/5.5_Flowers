package by.module5.task5.entity.wrapper;

public class Ribbon extends Wrapper {
	static {
		type = WrapperType.RIBBON;
	}
	
	public Ribbon(double price) {
		super(price);
	}
	
	public Ribbon(double price, String ccomment) {
		super(price, ccomment);
	}

}
