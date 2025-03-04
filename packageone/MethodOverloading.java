package packageone;

public class MethodOverloading {
	
	static void Add(int a,int b)
	{
		int sum=a+b;
		System.out.println("print the sum value is "+ sum);
	}
	 void Add(double a ,int b)
	{
		double SUM=a+b;
		System.out.println("print the SUM value is "+ SUM);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading M1=new MethodOverloading();
		M1.Add(10,20);
		M1.Add(10.2,20);
		

	}

}
