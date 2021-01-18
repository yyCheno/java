package factor;

public abstract class Pizza {
	private String name;
	public abstract void prepra();
	public void cake() {
		System.out.println(name+"caking");
	}
	public void setname(String name) {
		this.name = name;
	}
}
