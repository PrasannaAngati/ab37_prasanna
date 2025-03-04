package packageone;

public class ConstructorOverLoading02 {
	
	ConstructorOverLoading02(int a,int b) {
		double sum=a+b;
		System.out.println("Print sum value is "+ sum);
	}
   ConstructorOverLoading02(int a,double b) {
		double sub =a+b;
		System.out.println("Print sub value is "+sub);
	}
   ConstructorOverLoading02(double a,double b) {
	   double mul=a*b;
	   System.out.println("Print sub value is "+mul);
  	}

	public static void main(String[] args) {
	   new ConstructorOverLoading02(10,20);
	   new ConstructorOverLoading02(10,20.5);
	   new ConstructorOverLoading02(10.22,20.5);
	   
	   

	}

}
