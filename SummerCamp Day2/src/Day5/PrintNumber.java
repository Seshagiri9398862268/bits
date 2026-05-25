package Day5;
public class PrintNumber {

     public static void func(int n){
        // base case
         if ( n == 0) return;

         // recursive call
         func(n-1);
         System.out.println(n+" ");
     }
        
         public static void main(String [] args) {
            func(5);
         }
            
        }
    