package packageone;

public class LogicalOperatorNOT {

	public static void main(String[] args) {
	

		int a=10;
		int b=20;
		if (!(a>6 && b>6))
    {
	System.out.println("Print not operator");
	}
		if (!(a>6 || b>6))
	    {
		System.out.println("Print not operator");
		}
	}

}
