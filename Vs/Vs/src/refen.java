import java.util.*;

public class refen {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<Integer>();
        a.add(1);
        List<Integer> b = a;
        a.add(2);
        b.add(3);
       for (Integer integer : a) {
           System.out.println(integer);
       }
    }   
}
 