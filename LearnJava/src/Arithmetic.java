
import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] args) {
		// Defining scanner to accept user input
		Scanner scanner = new Scanner(System.in);
		
		// Defining 3 variables
		System.out.println("Enter x value:");
		double x = scanner.nextDouble();
		System.out.println("Enter y value:");
		double y = scanner.nextDouble();
		System.out.println("Enter v value:");
		double v = scanner.nextDouble();
		
		//Scanner scanner = new Scanner(System.in);
		// Use the math method to compare two values
		double z = Math.max(x, y);
		double w = Math.min(x, y);
		// Find the absolute value of a number
		double t = Math.abs(v);
		// Find a Square root of a value
		double s = Math.sqrt(y);
		// Round a value
		double r = Math.ceil(x); // can use .ceil(round up) or .round 
		// or .floor(round down)


		// Display the result 
		System.out.println("The max between x, y:");
		System.out.println(z);
		System.out.println("The min between x, y:");
		System.out.println(w);
		System.out.println("The absolute value of v:");
		System.out.println(t);
		System.out.println("The Square root of y:");
		System.out.println(s);
		System.out.println("Round the value of x:");
		System.out.println(r);
		scanner.close();
	}

}

