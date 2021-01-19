package adapter.objectadapter;

public class Phone {
	public void charging(Voltage5 voltage5) {
		if(voltage5.output5() == 5) {
			System.out.println("OK....");
		}else {
			System.out.println("danger!!!!");
		}
	}
}
