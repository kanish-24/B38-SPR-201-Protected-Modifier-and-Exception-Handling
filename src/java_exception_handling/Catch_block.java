package java_exception_handling;

public class Catch_block {
	
	public static void main(String[] args) {
		
		try {
		    int result = 10 / 0;
		} catch (ArithmeticException e) {
		    // Handle specific ArithmeticException
		    System.out.println("Cannot divide by zero.");
		} catch (Exception e) {
		    // Handle any other exception
		    System.out.println("An error occurred.");
		}
		
	}

}
