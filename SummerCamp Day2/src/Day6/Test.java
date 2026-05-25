package Day6;

public class Test {
    private int a; // private variable   
    public int b;
    int c;
    protected int d;
    public int printA(){
        return this.a; // method to access private variable
    } // public variable
    
    public void setData(int a) {
    
        this.a = a; // setter method to set the value of private variable   
    }
}
