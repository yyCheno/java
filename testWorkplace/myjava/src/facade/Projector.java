package facade;

public class Projector {


	private static Projector instance = new Projector();
	public static Projector getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("Projector ON");
	}
	public void off() {
		System.out.println("Projector OFF");
	}
	public void fouce() {
		System.out.println("Projector fouce");
	}
	
}
