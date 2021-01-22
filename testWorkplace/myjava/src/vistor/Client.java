package vistor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Man());
		objectStructure.attach(new Man());
		
		Success success = new Success();
		objectStructure.display(success);
	}

}
