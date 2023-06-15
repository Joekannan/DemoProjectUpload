package inheritanceConcept;

public class InheritanceCaroline extends InheritanceJoseph{
	
	//Caroline
	
	public static String house = "Duplex";
	public static int money = 5000;
	
	
	//no-args constructor
	public InheritanceCaroline() {
		System.out.println("I am the no args constructor coming from Caroline class");
	}
	
	public InheritanceCaroline(String name) {
		System.out.println("my name is - " + name);
	}
	
	public static void carModel() {
		System.out.println("Caroline owns Telsa X model");
	}
	
	public static void main(String[] agrs) {
		InheritanceCaroline obj = new InheritanceCaroline();
		System.out.println(obj.car);
		obj.does();
	}
}
