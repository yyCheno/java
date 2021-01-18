package factor;

public class SimpleFactory {
	public Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("greek")) {
			pizza = new Greekpizza();
			pizza.setname(type);
		} else if(type.equals("Cheese")){
			pizza = new CheesePizza();
			pizza.setname(type);
		}else {
			return null;
		}
		return pizza;
	}
}
