package basics;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Input weight in kilogram: ");
	      float weight = sc.nextFloat();
	      System.out.print("Input height in meters: ");
	      float height = sc.nextFloat();
	      float BMI = weight / (height * height);
	      System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");

	}

}
