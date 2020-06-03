package by.module5.task5.entity.wrapper;

public class Paper extends Wrapper {
	static {
		type = WrapperType.PAPER;
	}
	
	public Paper(double price) {
		super(price);
	}
	
	public Paper(double price, String ccomment) {
		super(price, ccomment);
	}

}
