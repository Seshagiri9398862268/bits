package Day8;
import java.util.*;
public class Demo5 {
    public static void main(String [] args){
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "hello";
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
        
    
