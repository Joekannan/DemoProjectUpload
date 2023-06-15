package myPackage;

public class TypeOfOperator {

	public static void main(String[] args) {
		 int num1 = 10;
		 int num2 = 20;
		 
		System.out.println("Addition Result- " + (num1 + num2));
		System.out.println("Substraction Result- " + (num1 - num2));
		System.out.println("Multiplication Result- " + (num1 * num2));
		System.out.println("Division Result- " + (num1 / num2));
		System.out.println("Modulo Result- " + (num1 % num2));

		int num3;
		
		num3 = num2;
		System.out.println("Number 3 value is  "+ num3);
		
//		num3+= num2; // num3 = num3+num2;
//		System.out.println("Number 3 value is  "+ num3);
		
		boolean flag1 = true;
		boolean flag2 = false;
				
		System.out.println(flag1&&flag2);
		System.out.println(flag1||flag2);
		System.out.println(!flag2);
		System.out.println(flag1&&(!flag2));
		
		
		System.out.println(num1 > num2);
		System.out.println(num2 == num3);
		
		int num4 = (num2 > num3)?30:20;
		System.out.println(num4);
		
	}

}
