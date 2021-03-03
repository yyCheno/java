package sja;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapkey {
    public static void main(String[] args){
        Map<String,String> map = new LinkedHashMap<String,String>();
        map.put("s","2");
        map.put("a","3");
        map.put("z","5");
        map.put("y","2");
        map.remove("a");
        map.put("a","3");
        System.out.println(map.keySet());
    }
}
