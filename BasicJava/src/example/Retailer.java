package example;

public class Retailer {

	public static void purchase(int money) {
		
	}
	
	public static void Sale() {
		int a = 1000;     
		int x = Customer.purchase(a);  /// Retailer -  Sale caller
		                    // Customer purchase To Be called
		System.out.println(x);
		Customer.purchase(x);
		store(x);
		
	}
	
	public static void store(int m) {
		
	}
	
	
}
