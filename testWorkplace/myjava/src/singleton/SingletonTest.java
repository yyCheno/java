package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 instance = Singleton1.getInstance();
		Singleton3 iSingleton3 = Singleton3.INSTANCE;
		iSingleton3.say();
	}

}
