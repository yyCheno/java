package command;

public class LightOnCommand implements Command {

	LightReceiver light;
	public LightOnCommand(LightReceiver light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	@Override
	public void exccute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("L On UNDO");

	}

}
