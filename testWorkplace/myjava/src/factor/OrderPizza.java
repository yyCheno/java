package factor;

import java.util.Scanner;

public class OrderPizza {
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	String ordertypeString = "";
	public OrderPizza(SimpleFactory simpleFactory) {
		// TODO Auto-generated constructor stub
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
		do {
			ordertypeString = getType();
			pizza = this.simpleFactory.createPizza(ordertypeString);
			if(pizza!=null) {
				pizza.prepra();
				pizza.cake();
			}else {
				break;
			}
		} while (true);
	}
	public String getType() {
		Scanner inScanner = new Scanner(System.in);
		String readLine = inScanner.nextLine();
		return readLine;
	}
}
