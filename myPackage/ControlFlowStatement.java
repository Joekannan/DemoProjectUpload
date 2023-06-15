package myPackage;

public class ControlFlowStatement {

	public static void main(String[] args) {
		int a = 0;
		
		if(a > 0) {
			System.out.println("Number is greater than zero");
		}
		else if(a == 0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Number is not greater than zero");
		}		
		
		
		int mark = 70;
		
		if(mark < 100) {
			System.out.println("The student has scored less than 100");
			if(mark > 50) {
				System.out.println("The student has scored more than 50");
			}
		}
	}

}
