import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        public static boolean solution(int num){
            // step 2
            temp = num;
            double result = 0;
            while (temp !=0) {
                int digit = temp %10;
                result = result+Math.pow(digit, count);
                temp/=10;
            }

            System.out.println(result + " "+num);
            return result == num;
            public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                if (solution(num)) {
                    System.out.println(" This is a Armstrong number");
                }else{

                    System.out.println(" Not a Armstrong number");
                    
                
            
                }
        
    }
}
