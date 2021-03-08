package sja;

public class finallys {
    public static void main(String[] args) {

        System.out.print(name());
    }

    public static int name() {
        int a = 1;
        try {
            return a;
        } catch (Exception e) {
            //TODO: handle exception
        }finally{
            a = 2;
            return 0;
        }

    }
}
