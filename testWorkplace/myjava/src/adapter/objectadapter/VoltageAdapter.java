package adapter.objectadapter;

public class VoltageAdapter  implements Voltage5 {
	private Voltage220 voltage220;
	public VoltageAdapter(Voltage220 voltage220) {
		// TODO Auto-generated constructor stub
		this.voltage220 = voltage220;
	}
	
	@Override
	public int output5() {
		// TODO Auto-generated method stub
		int src = voltage220.output220();
		int dst = src/44;
		return dst;
	}

}
