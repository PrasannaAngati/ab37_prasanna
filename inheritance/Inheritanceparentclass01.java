package inheritance;

class Inheritanechildclass01 {
	
	static void addition() {
	
		System.out.println("Print Addition");
	}

	
}

public class Inheritanceparentclass01 extends Inheritanechildclass01{
	
	static void Subtraction() {
		
		System.out.println("Print Subtraction");
	}
static void Multiplication() {
		
		System.out.println("Print Multiplication");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition();
		Subtraction();
		Multiplication();

	}

}
