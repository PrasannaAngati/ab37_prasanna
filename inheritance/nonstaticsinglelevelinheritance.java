package inheritance;

class parent {
	
	void parentmethod()
	{
	System.out.println("Parentmethod");
	}
	
	void childmethod1()
	{
		System.out.println("Childmethod1");
	} 
	
}


public class nonstaticsinglelevelinheritance extends parent {
	void childmethod()
	{
		System.out.println("Childmethod");
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticsinglelevelinheritance n1=new nonstaticsinglelevelinheritance()
;
		n1.childmethod();
		n1.parentmethod();
		n1.childmethod1();
		}

}
