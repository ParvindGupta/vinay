package PracticeSet;

public class abcde {

	public static void main(String[] args) {
		paybleAmount(10000,5,5);
	}
public int paybleAmount(int mrp,int CGST,int SGST) {
	 
	return mrp+CGSTprsnt(amount,CGST)+SGSTprsnt( amount, SGST);
}
public static int CGSTprsnt(int amount,int CGST) {
	
return amount*CGST/100;
}
public static int SGSTprsnt(int amount,int SGST) {
	return amount*SGST/100;
}
}
