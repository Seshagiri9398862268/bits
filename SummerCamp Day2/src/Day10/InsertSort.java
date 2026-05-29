package Day10;
import java.util.*;
public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){ // / checking where we need to do the insertion
                {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // placing element
        }
        System.out.println(Arrays.toString(arr));
    }
} 
        }
