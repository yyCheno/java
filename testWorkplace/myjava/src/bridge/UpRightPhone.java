package bridge;

public class UpRightPhone extends Phone {

	public UpRightPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	public void open() {
		super.open();
		System.out.println("·­¸Ç");
	}
	public void close() {
		super.close();
		System.out.println("·­¸Ç");
	}
	public void call() {
		super.call();
		System.out.println("·­¸Ç");
	}
}
