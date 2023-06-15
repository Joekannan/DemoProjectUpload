package myPackage;

public class ConstructorChaining {

	String name;
	int age;
	
	public ConstructorChaining() {
		this("My Practise Program");
	}
	
	public ConstructorChaining(String a) {
		this("Jothi", 30);
	}
	
	public ConstructorChaining(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining();
		
	}

}
