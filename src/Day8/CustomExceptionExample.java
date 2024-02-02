package Day8;

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            int result = divide(10, 10);  // Call a method that may throw an ArithmeticException
            System.out.println("Result: " + result);  // This line will not be executed
        } catch (ArithmeticException ae) {
            System.err.println("ArithmeticException caught: " + ae.getMessage());
        }
    }


    private static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}