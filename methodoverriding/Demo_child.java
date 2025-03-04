package methodoverriding;
class Demo_Parent {
void add() {
	System.out.println("Adding with 3 numbers");
}
}


public class Demo_child extends Demo_Parent{
	void add() {
	System.out.println("Adding with 2 numbers");
	super.add();
	}
	public static void main(String[] args) {
		Demo_child D1=new Demo_child();
		D1.add();
	}

}
