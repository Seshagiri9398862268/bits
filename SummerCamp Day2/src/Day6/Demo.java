package Day6;

class A{
    public void m1() {
        System.out.println("Hello, I am class A");

    }
}

class B extends A {
    public void m2() {
        System.out.println("Hello, I am class B");
    }
}
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
//        a.m2(); // Compile time error

//case 2
        B b = new B();
        b.m1();  // this will work because class B inherits from class A
        b.m2();
//case 3
         A a1 = new B();
         a1.m1();
         //a1.m2(); // Compile time error

         // //case 4
        B b1 = new B();
        b1.m1();
        b1.m2();

    }
}