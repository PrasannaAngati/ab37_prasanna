package stringFunctionsconcept;

public class StringFunctionsConcept {

	public static void main(String[] args) {

		String name="Good";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		String S1="My name is Lakshmi Prasanna";
		String S2="        My name is Lakshmi Prasanna ";
		System.out.println(S1.length());
		System.out.println(S2.length());
		System.out.println(S1.trim());//remove space starting and ending of the string but not the in between the string
		System.out.println(S2.trim());
		

}
}
