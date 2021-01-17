package liskov;

public class liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A  a =new A();
		System.out.println("11-3=" + a.fun1(11, 3));
		B b = new B();
		System.out.println(b.fun1(11, 3));
		System.out.println(b.fun2(11, 3));
	}

}
