package heapdemo;

public class Headdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long initialmen = Runtime.getRuntime().totalMemory()/1024/1024;
		long maxmen = Runtime.getRuntime().maxMemory()/1024/1024;
		long free = Runtime.getRuntime().freeMemory()/1024/1024;
		System.out.println("-Xms:" + initialmen+"M");
		System.out.println("-Xmx:" + maxmen+"M");
		System.out.println("free:"+free+"M");
		System.out.println("sys:" + initialmen*64.0/1024+"G");
		System.out.println("sys:" +maxmen*4.0/1024+"G");
	}

}
