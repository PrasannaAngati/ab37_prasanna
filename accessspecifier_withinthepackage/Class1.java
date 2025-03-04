package accessspecifier_withinthepackage;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 C1=new Class2();
		C1.add();
		C1.div();
		C1.mul();
		//C1.sub();//we can not access the private method within the same package
	}

}
