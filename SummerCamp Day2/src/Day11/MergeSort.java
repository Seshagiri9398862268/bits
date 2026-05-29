package Day11;
import java.util.*;
public class  MergeSort {
    public static void main(String[] args){
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        divide(arr, 0, n - 1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
    public static void divide(int arr[], int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            conquer(arr, low, mid, high);
        }
    }
    public static void conquer(int arr[], int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[low + i];
        }
        for(int j = 0; j < n2; j++){
            right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
       
       
        }












