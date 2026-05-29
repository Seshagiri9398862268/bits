package Day8;
import java.util.*;
public class Index4 {
    public static void main(String[] args){
    TreeSet<Integer> set = new TreeSet<>();
    set.add(1);
    set.add(4);
    set.add(7);
    set.add(78);
    set.add(4);
    System.out.println(set);
    LinkedList<Integer> s = new LinkedList<>(set);
    System.out.println(s);
}
}