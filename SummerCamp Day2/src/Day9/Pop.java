package Day9;
import java.util.*;
public class Pop {
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
    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }
        int value = arr[top];
        top--;
        System.out.println(value+"-> removed");
    }
    public static void main(String[] args) {
        Push s = new Push();
        Pop obj = new Pop();
        obj.push(10);
        obj.push(90);
        obj.push(910);
        obj.push(190);
        obj.push(908);
        obj.push(210);
        obj.pop();
        obj.pop();
    }
}

