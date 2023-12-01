package OopsInheritenceExtends;

public class Usre {

	public static void main(String[] args) {
		A aObj=	new A();   ///      A -Child
		aObj.b1();
		aObj.a1();
		aObj.c1();                      // A class..........three static methad.
		                                //B class............three non static methad
		                                // C class...........One static & one non static methad.
                                        // D class............One static & two non static methad.                                                  
		B bObj=new B();    ////     B-Parent
		bObj.b1();
		bObj.c1();      //A....child......B.....Parent(A)...&....C....GrandParent(A)....&....D....Grand Grad Parent(A)?

		C cObj=new C();     /////    C-Grand Parent
		cObj.c1();
		aObj.a1(); 
		aObj.d3();
		
		///Agar ham A class ke  refrence variabl ko lekar usake sath (dat . ) lagate hai to
		               /// to uske parent or grand & grand grand parent ke sabhi static & non static methad so karenge.
		               /// kyoki class A ke parent B hai or class B ke parent class C hai or class C ke parent D hai to 
		             // To A class ke D class grand grand Parent hai.
		             // ye sabhi kam Sirf EXTENDS ke sahare ho rhe hai .
		
		
		
		
		// Sapose- A is a Child , B A is of Parent And C A is of Grand Parent.....! 
                                  //.....Java alwayes say that Dont't Repeat yourSelf (DRY)                                          
 //Ak baat or ham jante hai ki static methad class ke sath load ho jate hai
		//Lekin  non static methad sirf obj ke sath load hote hai.
		//






	}

}
