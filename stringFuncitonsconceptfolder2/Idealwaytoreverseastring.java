package stringFuncitonsconceptfolder2;

public class Idealwaytoreverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Komal";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			
			char reverse=input.charAt(i);
			output=output+reverse;	
			
		}
		System.out.println(output);
		//palindrome or not
		if(input.equals(output))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
			
			

	}

}
