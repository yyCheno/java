package flyweight;

public class ConcreteWebSite extends WebSite {
	private String type = "";
	public ConcreteWebSite(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(type);
	}

}
