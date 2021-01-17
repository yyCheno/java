package liskov;

public class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int fun1(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	public int fun2(int a,int b) {
		return fun1(a,b)+9;
	}
}
