public class mycalsslodartest {
    public static void main(String[] args) {
        myclassLoader loader = new myclassLoader("D:/java/Vs/Vs/src/");
        try {
            Class clazz = loader.loadClass("hello1");
            System.out.println(clazz.getClassLoader().getClass().getName());
            System.out.println(clazz.getClassLoader().getParent().getName());
        } catch (ClassNotFoundException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
