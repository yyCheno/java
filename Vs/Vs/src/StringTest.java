import jdk.jfr.Timestamp;

class StringTestP{
    public static void main(String[] args) {
        test1();
    }
    static void test1(){
        String s1 =new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    static void test2(){

    }

}