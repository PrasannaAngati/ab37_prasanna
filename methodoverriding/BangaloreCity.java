package methodoverriding;

class Karnataka {
	void ITHUB() {
		System.out.println("Karnatakacity");
	}
}

public class BangaloreCity extends Karnataka{
 void ITHUB() {
	 super.ITHUB();
	 System.out.println("BangaloreCity");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangaloreCity B1=new BangaloreCity();
		B1.ITHUB();
	}

}
