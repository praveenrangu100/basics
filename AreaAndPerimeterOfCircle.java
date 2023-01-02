package basics;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of circle in mm ");
		float radius = sc.nextFloat();
		final float pi = 3.14f;
		
		System.out.println("Area of circle is " + ( pi * radius * radius));
		System.out.println("Perimeter of circle is " + ( 2 * pi * radius));

	}

}
