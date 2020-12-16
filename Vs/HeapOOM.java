import java.util.ArrayList;

public class HeapOOM {
    byte[] buffer = new byte[1*1024*1024];
    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();
        int conut = 0;
        try {
            while(true){
                list.add(new HeapOOM());
                conut++;
            }
        } catch (Throwable e) {
            System.out.println("count=" + conut);
            e.printStackTrace();
        }
    }
}
