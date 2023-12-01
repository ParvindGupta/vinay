package RinkuSirPractice;

import java.util.Scanner;

public class ScannerAndDoWhile {

	public static void main(String[] args) {
		String Y_N=" ";
		Scanner scn= new Scanner(System.in);
		do {
			System.out.println("Please Enter your name");
			String yourName = scn.nextLine();	

			System.out.println("Please Enter your Address");
			
			String yourAddress=scn.nextLine();

			System.out.println("Enter your mobile No..");
			String yourMobileNo= scn.nextLine();

			System.out.println("Please Enter your Age");
			String yourAge=scn.nextLine();

			System.out.println(" Hello "+yourName+" You are From "+yourAddress+" And your mobile Number is "+yourMobileNo+" Welcome you are "+yourAge+"Years Old:");
			System.out.println("Do you want to enter another record?Yes/No");
			Y_N =scn.next();
		}while(Y_N.equalsIgnoreCase("Yes"));
		System.out.println("Good Bye!!!!!");
	}

}
