package Day8;
import java.util.*;

public class Index3 {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String k = sc.nextLine();
int n = sc.nextInt();
ArrayList<String> list = new ArrayList<>();
   for(int i=0; i<n; i++)
   {
    String value = sc.next();
    list.add(value);
   }
    System.out.println(list.contains(k));
   int c=0;
   for(String s : list){
    if(s.equals(k)){
        c++;
    }
   }
   System.out.println(c);   
}
}