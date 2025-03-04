package interfaceconcept;

interface logic1 {
	void login1();
	void auth();
	
}

interface logic2 extends logic1{
	void logout();
	void signin();
}


public class Interfaceconceptsecond implements logic2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceconceptsecond I1=new Interfaceconceptsecond();
		I1.login1();
		I1.auth();
		I1.logout();
		I1.signin();
	}

	@Override
	public  void logout() {
		// TODO Auto-generated method stub
		 System.out.println("logout");
	}

	@Override
	public void signin() {
		// TODO Auto-generated method stub
		 System.out.println("signin");
	}

	@Override
	public void login1() {
		// TODO Auto-generated method stub
		 System.out.println("login");
	}

	@Override
	public void auth() {
		// TODO Auto-generated method stub
		 System.out.println("auth");
		
	}

}
