package stringFunctionsconcept;

public class CheckgivenStringisdigitornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In a given a string find out which is char which is digit
		
		String name="Rahul123";
		char c1[]=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.println(c1[i]+" is a digit");
			}
			else
			{
				System.out.println(c1[i]+" is a char");
		}
			
	}
	}

}
