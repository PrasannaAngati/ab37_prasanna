package arraysconcept;

public class Averageofthearray {

	public static void main(String[] args) {
     int rollno[]=new int[4];
     rollno[0]=10;
     rollno[1]=20;
     rollno[2]=30;
     rollno[3]=40;
     int sum=0;
     for(int i=0;i<rollno.length;i++)
     {
    	 sum=sum+rollno[i];
     }
     System.out.println(sum);
     double average=sum/rollno.length;
     System.out.println(average);
     double remainder=sum%rollno.length;
     System.out.println(remainder);
	}

}
