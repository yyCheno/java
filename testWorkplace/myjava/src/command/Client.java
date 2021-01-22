package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LightReceiver lightReceiver = new LightReceiver();
		
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		remoteController.onButtonWasPushed(0);
	}

}
