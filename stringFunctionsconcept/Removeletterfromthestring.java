package stringFunctionsconcept;

public class Removeletterfromthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="Abhishek";
		System.out.println(S1.repeat(10));
		System.out.println(S1.replace("A",""));
		System.out.println(S1.replace("A", "a"));
		
		String quote="I love my country";
		System.out.println(quote.replace(" ", ""));
		
		String A="name1234";
		System.out.println(A.replaceAll("[a-z]", ""));
		
		String a1="My Name Is Manish";
		System.out.println(a1.replaceAll("[a-z]", ""));
		
		System.out.println(a1.replaceAll("[A-Z]", ""));
		

	}

}
