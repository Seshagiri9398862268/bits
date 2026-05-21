package Day4;
import java.util.*;
 
public class ReverseString{
    public static void main(String args[]){
        String str;
        String rStr=" ";
        Scanner bf=new Scanner(System.in);
        System.out.println("Enter a string:");
           str=bf.nextLine();
         
        for(int loop=str.length()-1; loop>=0; loop--)
            rStr= rStr + str.charAt(loop);
         
        System.out.println("Reversed string is: " + rStr);
        bf.close();
    }
}