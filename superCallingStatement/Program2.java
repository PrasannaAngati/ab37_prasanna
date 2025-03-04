package superCallingStatement;
class two
{
	two(){
		System.out.println("2");
	}
}
class one extends two{
	one(){//super calling statement is present which will go and call the parent class 
		System.out.println("1");
	}
}
public class Program2 extends one{
	Program2(){
		System.out.println("3");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Program2();
	}

}
