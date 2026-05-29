package Day8;
import java.util.*;
public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ravi", 1);
        map.put("kumar", 2);
        map.put("sai", 3);  
        System.out.println(map);
        LinkedList<String> keys = new LinkedList<>(map.keySet());
        LinkedList<Integer> values = new LinkedList<>(map.values());
        System.out.println(keys);
        System.out.println(values);
        System.out.println(map.get("ravi"));
    }



}
