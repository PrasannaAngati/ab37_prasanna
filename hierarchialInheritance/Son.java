package hierarchialInheritance;
class parent {
	static void test2() {
		System.out.println("PrintTest2");
	}
}

class daughter extends parent{
	static void test1() {
		System.out.println("PrintTest1");
	}
}

public class Son extends parent{
	
	static void test() {
		System.out.println("PrintTest");
	}

	public static void main(String[] args) {
		test();
		//test1();
		test2();

	}

}
