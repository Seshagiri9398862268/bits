package Day8;
import java.util.*;
public class Demo2 {
    public static void main(String[] args){
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        s1.add(7); 
        HashSet<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        s2.add(6);
        s1.containsAll(s2);
        System.out.println(s1);
    }
}
