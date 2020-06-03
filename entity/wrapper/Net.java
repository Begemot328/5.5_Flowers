package by.module5.task5.entity.wrapper;

public class Net extends Wrapper {
	static {
		type = WrapperType.NET;
	}
	
	public Net(double price) {
		super(price);
	}
	
	public Net(double price, String ccomment) {
		super(price, ccomment);
	}

}
