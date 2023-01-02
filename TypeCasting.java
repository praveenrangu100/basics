package basics;

public class TypeCasting {

	public static void main(String[] args) {
		// Implicit typecasting widening
		int num1= 10;
		long ln=num1;
		System.out.println(ln);
		//explicit typecasting narrowing
		double num=5.23;
		short num2 = (short)num;
		System.out.println(num2);
	}

}
