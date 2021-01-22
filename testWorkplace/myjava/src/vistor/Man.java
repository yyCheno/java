package vistor;

public class Man extends Persion{
	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManReslut(this);
	}
}
