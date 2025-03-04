package stringFunctionsconcept;

import java.util.Arrays;
import java.util.Scanner;

public class Splitstringfunction {

	public static void main(String[] args) {

		String s1="My name is prasanna";
		String s2[]=s1.split(" ");
		s1.split(" ");
		System.out.println(s2[1]);
		System.out.println(Arrays.toString(s2));
		
		String sss[]=new String[4];
		sss[0]="My";
		sss[1]="Name";
		sss[2]="Is";
		sss[3]="Prasanna";
		System.out.println(Arrays.toString(sss));
		
	}

}
