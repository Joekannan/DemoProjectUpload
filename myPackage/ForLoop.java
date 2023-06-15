package myPackage;

public class ForLoop {

	public static void main(String[] args) {
		int num[] = {10, 20 , 30, 40 , 50};
		
		for(int i : num) {
			System.out.println(i);
		}
		
		String fruits[] = {"Apple", "Banana", "Orange", "Berry"};
		for(String fruit : fruits) {
			System.out.println(fruit);
			
		}
		
		
		int a = 0;
		while(a<=100) {
			System.out.println(a);
			a++;	
		}
		
		int b =0;
		do {
			System.out.println(b);
			b++;
		}while(b<=100);
		
	}

}
