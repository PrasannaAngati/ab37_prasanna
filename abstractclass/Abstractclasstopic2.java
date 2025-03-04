package abstractclass;

abstract class Abstract_class2
{
	abstract void login();
	abstract void otp();
}
abstract class Abstract_class1 extends Abstract_class2
{
	abstract void logout();
	
	void add() {
		System.out.println("Print logout");
	}
	static void sub() {
		System.out.println("Print logout");
	}
}

public class Abstractclasstopic2 extends Abstract_class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclasstopic2 A1=new Abstractclasstopic2();
		A1.add();
		A1.login();
		A1.logout();
		A1.otp();
	}

	@Override
	void logout() {
		// TODO Auto-generated method stub
	System.out.println("PrintLogout");	
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("PrintLogin");
	}

	@Override
	void otp() {
		// TODO Auto-generated method stub
		System.out.println("Printotp");	
	}

}
