package basics;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// &&,||,!
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		if (num1%7==0 || num1%10==0) {
			System.out.println("The number is divisible by 7 and 10");
			} else {
				System.out.println("The number is divisible by 7");
			}

	}

}
