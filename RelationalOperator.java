package basics;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		//<,>,<=,>=,==,!=
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		if  (age<=0) {
			System.out.println("Enter proper age");
		}
		else if (age<18) {
			System.out.println("you are not elgible to apply");
		}
		else {
			System.out.println("You are elgible to apply");
		}

	}

}
