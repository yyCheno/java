package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrganizationCompoenet gdut = new Universitity("GDUT", "gdut");
		
		OrganizationCompoenet auto = new College("自动化", "AUTO");
		
	    OrganizationCompoenet com = new College("计算机", "sada");
	    
	    gdut.add(auto);
	    gdut.add(com);
	    auto.add(new Department("数据科学", "大数据"));
	    auto.add(new Department("asdwqgs","dsafwg"));
	    com.add(new Department("16", "46465"));
	    com.add(new Department("888", "946"));
	    gdut.print();
	}

}
