package ccyy.oj;

import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in); while (in.hasNextInt()) { //注意while处理多个case  int a = in.nextInt();
            int b = in.nextInt();
            System.out.println( b);
        }
    }
}
