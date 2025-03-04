package stringFunctionsconcept;

public class StringFunctionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String name="Grotechminds";
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf('G'));
		System.out.println(name.substring(3));
		System.out.println(name.subSequence(2, 5));
		System.out.println(name.contains("Gro"));
		System.out.println(name.matches("Grotechminds"));
		System.out.println(name.isEmpty()); 
		String a="Abhishek";
		System.out.println(a.endsWith("A"));
		
	}

}
