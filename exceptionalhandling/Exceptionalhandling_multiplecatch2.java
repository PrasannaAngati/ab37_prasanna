package exceptionalhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

import scannertopic.Inputmismatchexception;

public class Exceptionalhandling_multiplecatch2 {

	public static void main(String[] args) {

		try {
			 Scanner S1=new Scanner(System.in);
			 boolean myanswerfordinner=S1.nextBoolean();//true or false should pass in the scanner value other wise it will throw the input mismatch exception
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
