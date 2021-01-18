package singleton;

public class Singleton2 {
	private static volatile Singleton2 instanceSingleton2;
	
	private   Singleton2() {}
	
	public static  Singleton2 getInstance() {
		if(instanceSingleton2==null) {
			synchronized (Singleton2.class) {
				if (instanceSingleton2 == null) {
					instanceSingleton2 = new Singleton2();
				}
			}
		}
		return instanceSingleton2;
	}
		
	}

