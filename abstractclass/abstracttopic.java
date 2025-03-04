package abstractclass;
abstract class RazorpayAPI  //Abstract class
{
	abstract void login();  //Abstract method
	//Suppressed and over-ridden
}
public class abstracttopic extends RazorpayAPI{

	public static void main(String[] args) {
		abstracttopic a1=new abstracttopic();
				a1.login();

	}

	@Override
	
	void login() {
    System.out.println("Internal logic");	
	}

}
