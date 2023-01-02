package basics;

import java.util.Scanner;

public class AreaOfRectangleUsingSacnner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//Class  object keyword constructor
		
		System.out.println("Enter the value for length");
		float length = sc.nextFloat();
		
		System.out.println("Enter the value for breadth");
		float breadth = sc.nextFloat();
		
		System.out.println("Area of rectangle is " + (length * breadth));
		
		

	}

}
