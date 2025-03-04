package thisKeywordconecpt;

public class Student_details {
    int age; //global varaible default value is 0
    String name; //global which is having default values is null
    double salary;
    
    void student_details(int age,String name,double salary)
    {
    	this.salary=salary;
    	this.age=age;//assigning the value of local variable to global variable
    	this.name=name;
    	System.out.println("Student deatils is as follow:");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_details T1=new Student_details();
		T1.student_details(100, "Ram",7.87);
		System.out.println(T1.age);
		System.out.println(T1.name);
		System.out.println(T1.salary);
		

	}

}
