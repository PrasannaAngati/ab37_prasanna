package exceptionalhandling;

import java.util.InputMismatchException;

import scannertopic.Inputmismatchexception;

public class Exceptionalhandling_multiplecatch {

	public static void main(String[] args) {

		try {
			int c=1/0;  //giving the exception so catch block will execute
		}
		catch(ArithmeticException a1)
		{
		System.out.println ("Int cannot store infinity,so please do not worry I have handled it");
		}
		catch(NullPointerException a2)
		{
		System.out.println ("Do not worry I will handled it");
		}
		catch(InputMismatchException a3)
		{
		System.out.println ("Please do not worry I have handled it");
		}
	}

}
