package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrganizationCompoenet gdut = new Universitity("GDUT", "gdut");
		
		OrganizationCompoenet auto = new College("�Զ���", "AUTO");
		
	    OrganizationCompoenet com = new College("�����", "sada");
	    
	    gdut.add(auto);
	    gdut.add(com);
	    auto.add(new Department("���ݿ�ѧ", "������"));
	    auto.add(new Department("asdwqgs","dsafwg"));
	    com.add(new Department("16", "46465"));
	    com.add(new Department("888", "946"));
	    gdut.print();
	}

}
