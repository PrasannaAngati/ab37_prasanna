package stringFunctionsconcept;

public class Givennumberispresentinarrayornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int number[]=new int[4];
		 number[0] =78;
		 number[1] =98;
		 number[2] =22;
		 number[3] =33;
		 
		 */
		
		//Syntax of creating an array
		int number[]= {78,55,34,87};
		int rollnotocheck=55;
		
		for(int i=0;i<=3;i++)
		{
			if(rollnotocheck==number[i])
			{
				System.out.println("Number to be check is present in a given array");
			}
			else
			{
				System.out.println("number is not present ");
			}
				
		}
			

	}

}
