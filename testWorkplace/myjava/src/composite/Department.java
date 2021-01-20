package composite;

public class Department extends OrganizationCompoenet {

	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println(super.getName());
	}

}
