package packageone;

public class NonStaticMethod {
	void add()
	{
		
		int a=10;
		int b=20;
		int Sum=a+b;
		System.out.println(Sum);
	}
	void subtract()
	{
		
		int a=20;
		int b=10;
		int Sub=a-b;
		System.out.println(Sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print non static method");
		
		NonStaticMethod a1=new NonStaticMethod();
		a1.add();
		NonStaticMethod a2=new NonStaticMethod();
		a1.subtract();

	}

}
