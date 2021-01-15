import java.nio.ByteBuffer;
import java.util.Scanner;

public class BufferTest {
    private static final int BUFFER = 1024*1024*1024;
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("Menory is ready...");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("Menory is doen...");
        buffer = null;
        System.gc();
        scanner.next();
        scanner.close();
    }
}
