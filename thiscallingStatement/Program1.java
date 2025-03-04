package thiscallingStatement;



public class Program1 {
	
	Program1(String a){
	System.out.println("Testprogram1")	;
	}
	
    Program1(int a){
    	this("Ram");
    	System.out.println(a+5);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program1(11);
		

	}

}
