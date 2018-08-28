package demoAssignment.driver;

import java.io.File;

public class Driver {

public static void main(String args[]) {
	try {
		validation(args);
		System.out.println("hello world");
		//System.out.println("args[0]="+args[0]);
		//System.out.println("args[1]="+args[1]);
		//System.out.println("args[2]="+args[2]);
		System.out.println("args.length="+args.length);
		System.out.println("INFO: completed");
	
	} catch (Exception e) {
		e.printStackTrace();
		System.err.println("Error Message: " + e.getMessage());
		System.exit(1);
		}
	}

	private static void validation(String args[]) {
		// code to validate command line arguments;
		System.out.println("INFO: argument validation done!!");
	}
}
