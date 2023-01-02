package basics;

import java.util.Scanner;

public class ArthematicOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		float a = sc.nextFloat();
		
		System.out.println("Enter the value of b");
		float b = sc.nextFloat();
		
		System.out.println("Addition of a and b " + (a + b));
		System.out.println("Subtraction of a and b " + ( a - b));
		System.out.println("Multiplication of a and b" + ( a * b));
		System.out.println("Division of a and b" + ( a / b));
	}

}
