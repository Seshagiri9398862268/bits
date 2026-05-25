package Day7;

public class Exception {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a runtime exception: " + e.getMessage());
        }
    }
}
