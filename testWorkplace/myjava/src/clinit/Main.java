package clinit;

public class Main {
	static {
		a = 1;
	}
	static int a = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(Main.class.getClassLoader());
	}

}
