package exceptions;

public class Unhandled_ExceptionExample {

    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (RuntimeException e) {
            // Handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
        }
        // This line will execute if the exception is caught
        System.out.println("This line will execute after handling the exception.");
    }

    public static void methodThatThrowsException() {
        // Throwing an unchecked exception (RuntimeException)
        throw new RuntimeException("This is an unhandled exception.");
    }
}


//Exception in thread "main" java.lang.RuntimeException: This is an unhandled exception.
//at UnhandledExceptionExample.methodThatThrowsException(UnhandledExceptionExample.java:10)
//at UnhandledExceptionExample.main(UnhandledExceptionExample.java:5)



