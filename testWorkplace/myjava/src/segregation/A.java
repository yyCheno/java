package segregation;

public class A {
	public A() {
		// TODO Auto-generated constructor stub
	}
	public void depend1(interface1 i) {
		i.operation1();
	}
	public void depend2(interface1 i) {
		i.operation2();
	}
	public void depend3(interface1 i) {
		i.operation3();
	}
}
