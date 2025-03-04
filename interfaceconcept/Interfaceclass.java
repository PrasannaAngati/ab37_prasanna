package interfaceconcept;

interface Amazon
{
	void login();
	void logout();
}

public class Interfaceclass implements Amazon {

	public static void main(String[] args) {
		Interfaceclass I1=new Interfaceclass();
		I1.login();
		I1.logout();
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
		
	}

}
