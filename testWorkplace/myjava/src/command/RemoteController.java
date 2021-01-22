package command;

public class RemoteController {
	Command[] omCommands;
	Command[] offCommands;
	
	Command undoCommand;
	
	public RemoteController() {
		// TODO Auto-generated constructor stub
		omCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < offCommands.length; i++) {
			omCommands[i] = null;
			offCommands[i] = null;
		}
	}
	
	public void setCommand(int no,Command command,Command offCommand) {
		omCommands[no] = command;
		offCommands[no] = offCommand;
	}
	
	public void onButtonWasPushed(int no) {
		omCommands[no].exccute();
	}
}
