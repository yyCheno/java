package bridge;

public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	public void open() {
		super.open();
		System.out.println("�۵�");
	}
	public void close() {
		super.close();
		System.out.println("�۵�");
	}
	public void call() {
		super.call();
		System.out.println("�۵�");
	}

}
