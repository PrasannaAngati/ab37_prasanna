package arraysconcept;

import java.util.Arrays;

public class Copyastringfromonetoanother {

	public static void main(String[] args) {
		// TODO Auto-generated  stub
		
		int rollno[]=new int[4];
		rollno[0]=10;
		rollno[1]=30;
		rollno[2]=20;
		rollno[3]=15;
		int rn[]=new int[4];
		
		for(int i=0;i<=3;i++)
		 {
			rn[i] =rollno[i];
					System.out.println(rn[i]);
					
		 }
		System.out.println("Original araay is"+Arrays.toString(rollno));
		System.out.println("Copied araay is"+Arrays.toString(rn));	
		

	}

}
