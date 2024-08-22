package exceptions;

public class ExceptionHandlingExample {
	
	// Handling Exceptions Properly
	
	    public static void main(String[] args) {
	        try {
	            methodThatThrowsException();
	        } catch (RuntimeException e) {
	            // Handle the exception
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	        // This line will execute if an exception is caught
	        System.out.println("This line will execute after handling the exception.");
	    }

	    public static void methodThatThrowsException() {
	        throw new RuntimeException("This is an unhandled exception.");
	    }
	}

//Caught an exception: This is an unhandled exception.
//This line will execute after handling the exception.
