package abstractclass;

abstract class API
{
	abstract void login();
	abstract void auth();
	abstract void twowayauth();
}

public class Abstractclasstopic extends API{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclasstopic A1=new Abstractclasstopic();
		A1.auth();
		A1.login();
		A1.twowayauth();
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("login method");
		
	}

	@Override
	void auth() {
		// TODO Auto-generated method stub
		System.out.println("authentication method");
	}

	@Override
	void twowayauth() {
		// TODO Auto-generated method stub
		System.out.println("twowayauthentication method");
	}

}
