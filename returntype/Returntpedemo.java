package returntype;

public class Returntpedemo {
    int add(int a,int b)
    {
    	int sum=a+b;
    	return sum;
    }
    double subtract(int a,int b)
    {
    	double sub=a-b;
    	return sub;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntpedemo r1=new Returntpedemo();
		System.out.println(r1.add(10, 20));
		System.out.println(r1.subtract(20, 10));
	}

}
