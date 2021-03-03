import java.util.Map;

public class mapkey{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String, String>();
        map.put("s","2");
        map.put("a","3");
        map.put("z","5");
       System.out.println(map.keySet());
    }
}