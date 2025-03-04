package arraysconcept;

import java.util.Arrays;

public class Howtosortaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name[]=new String[3];
    name[0]="ram";
    name[1]="sita";
    name[2]="krishna";
    System.out.println(Arrays.toString(name));
    Arrays.sort(name);
    System.out.println(Arrays.toString(name));
    
    int rollno[]=new int[3];
    rollno[0]=1;
    rollno[1]=21;
    rollno[2]=15;
    System.out.println(Arrays.toString(rollno));
    Arrays.sort(rollno);
    System.out.println(Arrays.toString(rollno));
    
    
    
    
	}

}
