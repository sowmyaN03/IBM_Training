public class exceptions {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
 
class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
 
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}