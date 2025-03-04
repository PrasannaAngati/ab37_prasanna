package superCallingStatement;

class state_class {
	  state_class()
	{
		System.out.println("1");
	}
	
	
}

public class SuperCallingStatement extends state_class{
    SuperCallingStatement()
	{ //super calling statement is present here which is invisible
		System.out.println("2");
	}
	public static void main(String[] args) {
		SuperCallingStatement S1=new SuperCallingStatement();
		
	}

}
