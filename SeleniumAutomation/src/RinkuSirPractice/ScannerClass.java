package RinkuSirPractice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
	for(int i=0;i<10;i--) {
		
	
		Scanner scr=new Scanner(System.in);
         System.out.println("enter num1");
         int num1=scr.nextInt();
         System.out.println("enter num2");
         int num2=scr.nextInt();
         System.out.println("Total :-  "+(num1+num2));
	}
	}
}


