 import java.util.*;
 
public class ReverseNumber{
 
     public static void main(String []args){
        int number;
         
        Scanner sc=new Scanner(System.in);
         
        //Read Number
        System.out.print("Enter an integer number: ");
        number=sc.nextInt();
        
        int reverse_number=0;
        while(number>0)
        {
            reverse_number = (reverse_number*10) + number%10;
            number/=10;
        }
         
        System.out.println("Reverse Number is: " + reverse_number); 
         
     }
}