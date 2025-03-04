package stringFunctionsconcept;

import java.util.Date;

public class Currenttimeofyoursystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//date class is used to give the time present in the laptop
		//epoch
		
		Date d1=new Date();
		System.out.println(d1.getTime());//epouch converter time and this is converted in google
		Date d2=new Date(d1.getTime());
		System.out.println(d2);//human understandable time
		String mydate=d2.toString();
		System.out.println(mydate);
		
		

	}

}
