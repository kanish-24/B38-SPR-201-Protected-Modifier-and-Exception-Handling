package java_exception_handling;

public class Finally_block {

	public static void main(String[] args) {
		
		try {
		    int result = 10 / 0;
		} catch (ArithmeticException e) {
		    System.out.println("Cannot divide by zero.");
		} finally {
		    // Cleanup code, always executed
		    System.out.println("This will always execute.");
		}

		
	}
}
