package command;

public class LightOffCommand implements Command {
	LightReceiver light;
	public LightOffCommand(LightReceiver light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	@Override
	public void exccute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("L OFF UNDO");

	}

}
