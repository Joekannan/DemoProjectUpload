package myPackage;

public class House {

	int bedrooms = 4;
	static int kitchen = 1;
	
	
	public static void paint() {
		System.out.println("House is painted using Pink ");
	}

	public static void main(String[] args) {
		
		House ourHouse;
		
		
		House myHouse = new House();
		House yourHouse = new House();
		myHouse.paint();
		paint();
		System.out.println(myHouse.bedrooms);
		System.out.println(myHouse.kitchen);
		System.out.println(kitchen);
		System.out.println(yourHouse.bedrooms);
		System.out.println(yourHouse.kitchen);
		
		myHouse.bedrooms = 5;
		myHouse.kitchen = 2;
		
		System.out.println(myHouse.bedrooms);
		System.out.println(myHouse.kitchen);
		System.out.println(yourHouse.bedrooms);
		System.out.println(yourHouse.kitchen);
		
		
		
		yourHouse.bedrooms = 6;
		yourHouse.kitchen = 3;
		System.out.println(myHouse.bedrooms);
		System.out.println(myHouse.kitchen);
		System.out.println(yourHouse.bedrooms);
		System.out.println(yourHouse.kitchen);
	}

}
