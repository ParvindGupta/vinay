package Upcausting_downcausting;

public class test {

	public static void main(String[] args) {
		WebMdriver driver	=new ChromeMDriver();  // Upcausting object.
		//driver.
		//       When parent Refrence and child object 
		//      Both methods load parent & child..../
		//       but call only parent methad

		/// We want parent & child methad call then 
		//		That upcausting object in create downcausting 
		//when be direct downcousting is not possible.
		//Downcausting will be run when upcausting is done before it.

		ChromeMDriver ab=(ChromeMDriver) driver; // downcausting 

		// we use both methad Parent & child 
		ab.ss1();//ChromeMDriver
		ab.nn1();//WebMdriver

     WebMdriver driver2=  new firefoxMdriver();
     // driver2
// only for show parent method but load both parent &child.()
//It is upcausting object.
     
     firefoxMdriver ca= (firefoxMdriver) driver2;
     //ca.
     //We both methad use parent & child.
     
     
     
     
     
     
     
     
     
     
     
     

		///ChromeMDriver= inside 3 non static methad'''''
		//firefoxMdriver=inside 4 non static methad...
		//WebMdriver=inside 4 non static methad...
	}

}
