package composite;

public abstract class OrganizationCompoenet {

	private String name;
	private String des;
	
	public OrganizationCompoenet(String name,String des) {
		super();
		this.setName(name);
		this.setDes(des);
		// TODO Auto-generated constructor stub
	}
	protected void add(OrganizationCompoenet organizationCompoenet) {
		throw new UnsupportedOperationException();
	};
	
	protected void remove(OrganizationCompoenet organizationCompoenet) {
		throw new UnsupportedOperationException();
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
	protected abstract void print();
}
