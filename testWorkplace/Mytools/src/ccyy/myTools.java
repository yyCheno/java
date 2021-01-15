package ccyy;

public class myTools {
	public myTools() {
		// TODO Auto-generated constructor stub
	}
	public static  String toString(int[] arr) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[");
		for (int i : arr) {
			stringBuffer.append(i);
			stringBuffer.append(",");
		}
		stringBuffer.append("]");
		return stringBuffer.toString();
	}
}
