package Day8;
import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        LinkedList<String> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);
}
}

