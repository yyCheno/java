package adapter.objectadapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220()));
	}

}
