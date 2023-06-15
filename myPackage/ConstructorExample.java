package myPackage;

public class ConstructorExample {
	
	String name;
	
	public ConstructorExample() {
		System.out.println("I am the constructor to initialize the variable");
		this.name = "Caroline";
		System.out.println("My name is - "+ this.name);
	}

	public ConstructorExample(String name) {
		System.out.println("My name is - "+ name);
	}
	
	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample();
		
		ConstructorExample obj1 = new ConstructorExample("Jothi");
		
	}

}
