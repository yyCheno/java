package adapter.interfaceadapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbsAdapter() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("ֻ��Ҫ������Ҫ�ķ���");
			}
		}.m1();
		
	}

}
