package myPackage;

public class CallingMethods {

	
	
	public static void main(String[] args) {
		CallingMethods obj = new CallingMethods();
		obj.addition();
		
		addition(45, 90);
		addition(345,56,68);
		addition(5, "Caroline");
		addition("Caroline", 5);
		
	}

	public void addition() {
		int a =10;
		int b = 20;
		int c = a+b;
		System.out.println("Result is - " +c);
		
		addition(10,45);
	}
	
	public static void addition(int a, int b) {
		int c = a + b;
		System.out.println("Result is - " +c);
	}
	
	public static void addition (int a, int b, int c) {
		System.out.println("Result is - " + (a+b+c));
	}
	
	public static void addition(int a, String name) {
		
		System.out.println(name + " has " + a + " apples");
	}
	
	public static void addition(String name, int a) {
		
		System.out.println("I m doing fine");
	}
	
}
