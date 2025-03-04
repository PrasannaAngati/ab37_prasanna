package packageone;

public class Combination {
	
	Combination(){
		System.out.println("I am a constructor");
	}
	
	static
	{
		System.out.println("I am a SIB");
	}
	{
		System.out.println("I am a IIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I am a main method");
		Combination C1=new Combination();
		

	}

}
