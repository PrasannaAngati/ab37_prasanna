package arraysconcept;

public class Arrayconceptexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name[]=new String[3];
     name[0]="Lakshmi";
     name[1]="Prasanna";
     name[2]="Angati";
     
     int rollno[]=new int[3];
     rollno[0]=20;
     rollno[1]=40;
     rollno[2]=50;
     
     double salary[]=new double[3];
     salary[0]=22.3;
     salary[1]=24.3;
     salary[2]=26.3;
     
     for (int i=0;i<3;i++)
     {
    	 System.out.println(name[i]);
    	 System.out.println(rollno[i]);
    	 System.out.println(salary[i]);
     }
    	 
	}

}
