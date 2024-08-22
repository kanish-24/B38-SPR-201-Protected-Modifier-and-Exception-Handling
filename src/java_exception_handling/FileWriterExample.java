package java_exception_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) {
		
		        FileWriter writer = null;
		        try {
		            writer = new FileWriter("example.txt");
		            writer.write("Hello, World!");
		        } catch (IOException e) {
		            System.out.println("An I/O error occurred: " + e.getMessage());
		        } finally {
		            try {
		                if (writer != null) {
		                    writer.close(); // Ensure the resource is closed
		                }
		            } catch (IOException e) {
		                System.out.println("Failed to close the writer: " + e.getMessage());
		            }
		        }
		    }
		
	}


