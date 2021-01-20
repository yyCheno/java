package facade;

public class Popcorn {

	private static Popcorn instance = new Popcorn();
	public static Popcorn getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("Popcorn ON");
	}
	public void off() {
		System.out.println("Popcorn OFF");
	}
	public void pop() {
		System.out.println("pop ");
	}
}
