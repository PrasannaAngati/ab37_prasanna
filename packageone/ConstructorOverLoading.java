package packageone;

public class ConstructorOverLoading {
	
	ConstructorOverLoading() {
		System.out.println("Print constructor1");
	}
	
    ConstructorOverLoading(int a,int b) {
    	System.out.println("Print constructor2");
	}
    ConstructorOverLoading(int A) {
    	System.out.println("Print constructor3");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConstructorOverLoading();
		new ConstructorOverLoading(10,20);
		new ConstructorOverLoading(23);
	}

}
