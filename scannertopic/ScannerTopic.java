package scannertopic;

import java.util.Scanner;

public class ScannerTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a");
		Scanner S1=new Scanner(System.in);
		int a=S1.nextInt();
		System.out.println("Enter the value of b");
		Scanner S2=new Scanner(System.in);
		int b=S2.nextInt();
		int sum=a+b;
		System.out.println("Sum value is "+sum);
		
		

	}

}
