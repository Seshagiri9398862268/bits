package Day10;

import java.util.Scanner;

public class BinarySearch {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();  
    for(int j = 0; j < n-1; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
    
    }
}
    }







}
