package Day8;
import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ravi", 98);
        map.put("kumar", 97);
        map.put("sai", 99); 
        for(String key : map.keySet())
        {
            s1.add(map.get(key));
        }
        if(map.containsValue(98))
        {
            System.out.println("ravi is present in the map");
        }
    }




}
