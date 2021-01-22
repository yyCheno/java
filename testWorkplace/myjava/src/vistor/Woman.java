package vistor;

public class Woman extends Persion{
	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWonmanResult(this);
	}
}
