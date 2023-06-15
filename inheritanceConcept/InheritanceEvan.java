package inheritanceConcept;

public class InheritanceEvan extends InheritanceCaroline {

	
	public int gold = 10;
	
	public InheritanceEvan() {
		super("Caroline");
		System.out.println("I am the no arg constructor from Evan");
	}
		
	public static void carModel() {
		System.out.println("Evan owns Audi");
	}
	
	public void display() {
		super.carModel();
		carModel();
	}
	
	public static void main(String[] args) {
		
		InheritanceEvan obj = new InheritanceEvan();
	
		System.out.println(obj.money);
		obj.display();
		
	}

}
