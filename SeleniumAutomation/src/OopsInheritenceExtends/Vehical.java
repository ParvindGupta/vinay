package OopsInheritenceExtends;

import org.openqa.selenium.grid.Main;

public class Vehical {

String vehicaltayar;
	
	
	
}
class bike extends Vehical{
	String biketayar;
	 public void showdetail() {
		 vehicaltayar ="fortunar tayar RTR Company................./"; 
		 biketayar="KTM tayar RTR Company...................../";
		 System.out.println(vehicaltayar+"\n"+ biketayar);
	 }
		 public static void main(String[]args) {
			
			 bike bikeStutus= new bike();
			 bikeStutus.showdetail();
		 }
	 }
