package basics;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temperature in celsius");
		float celsius = sc.nextFloat();
		float fahrenheit = (celsius*9)/5 + 32;
		System.out.println("Celsius to fahrenheit is"+ fahrenheit);
		

	}

}
