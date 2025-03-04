package encapsulation;
class Authentication_API
{
	private String username="contact@gmail.com";
	
	public String get_username() {
		return username;
	}
	public void set_username(String username) {
		this.username=username;
	}
	
	private String password="password@321";
	
	public String get_password() {
		return password;
	}
	public void set_password(String username) {
		this.password=password;
	}
}
public class Encapsulation_class {

	public static void main(String[] args) {
		Authentication_API a1=new Authentication_API();
		a1.set_username("prasanna@gmail.com");
		a1.set_password("Prasanna");
		System.out.println(a1.get_username());
		System.out.println(a1.get_password());
		
	}

}
