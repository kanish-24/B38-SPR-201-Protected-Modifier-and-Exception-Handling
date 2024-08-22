package multi_catch;

public class CorrectOrderExample {
	
	
	    public static void main(String[] args) {
	        try {
	            // Code that may throw different types of exceptions
	            int result = 10 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an ArithmeticException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Caught a general Exception: " + e.getMessage());
	        }
	    }
	}



