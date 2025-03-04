package encapsulation;
class Amazon
{
	public String getUsername() {  //Getter method//If return is there in method then it should be string not the void
		return Username; //Fetched the value
	}

	public void setUsername(String username) { //Setter method
		this.Username = username;
	}

	private String Username="contact@grotechminds.com";
	
}
public class EncapsulationProgram {

	public static void main(String[] args) 
	{
      Amazon s1=new Amazon();
      s1.setUsername("Prasanna@gmail.com");
      System.out.println(s1.getUsername());
	}

}
