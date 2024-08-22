package multi_catch;

public class MultiCatchExample {
	
	
	    public static void main(String[] args) {
	        try {
	            // Code that may throw different types of exceptions
	            int result = 10 / 0; // This will throw ArithmeticException
	            String text = null;
	            text.length(); // This will throw NullPointerException
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an ArithmeticException: " + e.getMessage());
	        } catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Caught a general Exception: " + e.getMessage());
	        }
	    }
	}



