package superCallingStatement;
class two2
{
	two2(){
		System.out.println("2");
	}
}
class one1 extends two2{
	one1(){//super calling statement is present which will go and call the parent class 
		System.out.println("1");
	}
}
public class Program3 {
	Program3()
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program3 P1=new Program3();
		new one1();
	}

}
