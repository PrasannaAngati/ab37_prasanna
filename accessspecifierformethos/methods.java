package accessspecifierformethos;

public class methods {
	
	public void add() {
		System.out.println("Addition");
		
	}
	private void sub() {
		System.out.println("Subtraction");	
	}
    protected void mul() {
    	System.out.println("Multiplication");	
	}
    void div() {
    	System.out.println("Division");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods m1=new methods();
		m1.add();
		m1.div();
		m1.mul();
		m1.div();

	}

}
