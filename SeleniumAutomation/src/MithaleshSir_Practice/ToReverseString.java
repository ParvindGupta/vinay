package MithaleshSir_Practice;

public class ToReverseString {

	public static void main(String[] args) {
		//Question=> Write the program to Riverse String By three coundition rule......?
		//First Coundition handled to riverse String..........(1)
		
		ReverseIntPolindrumOrnot();
//		ReverseString();
//		ReverseInt();

	}
	public static void ReverseStringTo() {
	String name="parvind";
		for(char i=6; i<name.length();i--) {
			System.out.print(name.charAt(i));
		}

	}





	public static void ReverseString() {
		String a="naman";
		String store="";
		for(int i=a.length()-1;i>=0;i--) {
		store=store+a.charAt(i);	
		}
		if(a.contains(store)) {
		System.out.println(a+" "+"This is a polindrum");	
		}else {
			System.out.println("This is a not polindrum");
		}
	}
	public static void ReverseInt() {
		int number=12345;
		int reverse=0;
		int remainder;
		
		while(number>0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println(reverse);
		
		
	}
	public static void ReverseIntPolindrumOrnot() {
		int number=1331;
		int store=number;
		int reverse=0;
		int remainder;
		
		while(number>0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		if(store==reverse) {
		System.out.println(reverse+" "+"This is a polindrum number");	
		}else {
			System.out.println(reverse+" "+"This is a not polindrum number");
		}
	}
}