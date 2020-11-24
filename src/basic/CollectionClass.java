package basic;

import java.util.HashMap;
import java.util.Map;

public class CollectionClass {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("서","민정");
        map.remove("서");
        map.put("조","영숙");
        System.out.println(map);
        System.out.println(map.get("조"));

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(String s : map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
