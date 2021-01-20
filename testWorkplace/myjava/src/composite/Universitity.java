package composite;

import java.util.ArrayList;
import java.util.List;


public class Universitity extends OrganizationCompoenet {
	
	List<OrganizationCompoenet> organizationCompoenets = new ArrayList<OrganizationCompoenet>();
	
	public Universitity(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void add(OrganizationCompoenet organizationCompoenet) {
		// TODO Auto-generated method stub
		organizationCompoenets.add(organizationCompoenet);
	}
	@Override
	protected void remove(OrganizationCompoenet organizationCompoenet) {
		// TODO Auto-generated method stub
		organizationCompoenets.remove(organizationCompoenet);
	}
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("---------"+super.getName()+"---------");
		for (OrganizationCompoenet organizationCompoenet : organizationCompoenets) {
			organizationCompoenet.print();
		}
	}

}
