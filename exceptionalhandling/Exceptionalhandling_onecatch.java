package exceptionalhandling;

public class Exceptionalhandling_onecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
			int c=1/0;  //giving the exception so catch block will execute
		}
		catch(ArithmeticException a1)
		{
		System.out.println ("Int cannot store infinity,so please do not worry I have handled it");
		}
		
      
	}

}
