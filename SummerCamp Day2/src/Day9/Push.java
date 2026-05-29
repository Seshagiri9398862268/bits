package Day9;
import java.util.*;
public class Push {
 int arr[]= new int[5];
    int top = -1;
    void push(int data){
        //stack is full or not
        if(top == arr.length-1){
            System.out.println("Stack overflow");
        return;
        }
            top++;
            arr[top] = data;
        System.out.println(arr[top]+"-> inserted");
    }
    public static void main(String[] args) {
        Push s = new Push();
        s.push(10);
        s.push(90);
        s.push(910);
        s.push(190);
        s.push(908);
        s.push(210);



    }
    











}
