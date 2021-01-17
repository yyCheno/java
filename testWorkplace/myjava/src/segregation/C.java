package segregation;

public class C {
	public C() {
		// TODO Auto-generated constructor stub
	}
	public void depend1(interface1 i) {
		i.operation1();
	}
	public void depend4(interface1 i) {
		i.operation4();
	}
	public void depend5(interface1 i) {
		i.operation5();
	}
}
