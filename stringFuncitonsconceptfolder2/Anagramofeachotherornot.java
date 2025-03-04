package stringFuncitonsconceptfolder2;

import java.util.Arrays;

public class Anagramofeachotherornot {

	public static void main(String[] args) {
    
		String a1="animal";
		String a2="malina";
		if(a1.length()!=a2.length())
		{
			System.out.println("Not an anagram");
		
		}
		else
		{
			char[] c1=a1.toCharArray();
			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			char[] c2=a2.toCharArray();
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram Decoded");
				
			}
				
		}
			
	}

}
