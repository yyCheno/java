package scalar;

public class Scalartest {

	public static class user {
		public int id;
		public String nameString;
	}
	public static void alloc() {
		user u = new user();
		u.id = 5;
		u.nameString ="asd";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			alloc();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time:"+(end-start)+"ms ");
	}

}
