package MithaleshSir_Practice;

import java.util.Scanner;

public class Prime_NumberOrNot {

	public static void main(String[] args)  {
		normal();
	}
//		
//		//Question => Write the program to check whether the given number prime number or not...?
//		
	//                       (Frist coundition...?)
//		int  a=5;
//		
//		int count=0;
//		for(int i=1;i<=a; i++) {
//			if(a%i==0) {
//			
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("prime Number"+a);
//		}else {
//			System.out.println("Not Prime number"+a);
//		}
//		
//	
//
//	}
	//                   (Secound coundition........?)

	public static void normal() {
		for(int n=5;n<=100;n++) {
			int count=0;
			for(int i=1;i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
			
			
		}}}
	
	
	

