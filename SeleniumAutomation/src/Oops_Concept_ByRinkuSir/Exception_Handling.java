package Oops_Concept_ByRinkuSir;

public class Exception_Handling {

	public static void main(String[] args) {
		//int a=10;
		//int b=0;
		try {
			int c=10/2;
			System.out.println(c);           //try is a Excepation keyword It is work risky code(Handal to exception)
		}
		catch ( ArithmeticException s) {
			System.out.println("Arithmetic Exception to handal");
		}     // 
		System.out.println("hello");
		System.out.println("hello brother");
	}

	//Exception--->unwanted event that stop normal flow of execution of your program......./
	//There are two types of exception (1)checked exception (2)unchecked exception..
	//(1)checked exception -programer is responsible to handle it.
	//(2)unchecked exception- programer is not responsible to handle it. but programer can handle it.
	//Whenever an exception occurs in our program,there is a default exception handler created by the developers of java.
	//Default Handler Exception- jis kisi line mainexception aane ki sambhavna hoti hai.uska object  bana ke pata karata hai ki esase kon si Exception aane ki sambhavna hai.us exception ka name likh deta hai.
	
	//default Handler exception teen tarah ka exception batata hai 
	//1-Name of the Exception 
	//2-description of the Exception
	//3-Line Number of the Exception
	
	//Exception Handling- Exception handling is not repair the exception to point and ulternative way to allow the normal exce[ption your program that is nothing but exception handling.
	//----> Exception handling does not mean reaparing an excetion...
	//----> We have to define Alternative way to countinue rest to the program normally...
	//----> This Alternative way is nothing  but exception handling..
	// Java inside three type exception handling
	//1--->try---catch--block( This is the Best approach) 
	//2--->Throws
	//3--->Throw
//	            try {
//	            	Risky code
//	            }
//catch(Exception e) {
//	handling code
//}







}
