package Day9;
import java.util.*;
public class Main {
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
    void peak(){
        if(top == -1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println(arr[top]+"-> peeked");
    }
    boolean search(int key){
        for(int i=0; i<=top; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" No element in stack");
        return;
    }
    void Count(){
        System.out.println(top+1);
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.push(10);
        obj.push(90);
        obj.push(910);
        obj.push(190);
        obj.push(908);
        obj.push(210);
        obj.peak();
        obj.pop();
        System.out.println(obj.search(90)); // Output: true
        System.out.println(obj.search(100)); // Output: false
        obj.display();
        obj.Count();
    }
}
