package by.module5.task5.entity.wrapper;

public class Film extends Wrapper {
	static {
		type = WrapperType.FILM;
	}
	
	public Film(double price) {
		super(price);
	}
	
	public Film(double price, String ccomment) {
		super(price, ccomment);
	}

}
