package Parameter_Arguments;

public class returntype2 {

	public static void main(String[] args) {
		int z=m2(m1(2),m1(3));
		System.out.println(z);
	}
public static int m1(int a) {
	int x = a;
	x=x+a;
	return m2(x,a);
}
public static int m2(int x,int y) {
	
	int z = x*y;
	return z;
			
			
}
}
