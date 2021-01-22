package vistor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
	private List<Persion> persions = new LinkedList<Persion>();
	public void attach(Persion p) {
		persions.add(p);
	}
	public void detach(Persion p) {
		persions.remove(p);
	}
	public void display(Action action) {
		for (Persion persion : persions) {
			persion.accept(action);
		}
	}
}
