package myPackage;

public class LocalVariable {
	
	
	public static void printme() {
		int a = 100;
		System.out.println("I am a local variable, I hold the value - " + a);
	}
	
	public static void main(String[] agrs) {
		int a = 50;
		System.out.println("I am coming from main method - " + a);
		printme();
		
		short i = 128;
		System.out.println(i);
		
		String name = "Nagajothi Kaliappan";
		
	}

}
