package Interface;

public interface A {
	int x=8;
}
interface B{
	int x=9;
}
class ABC implements A,B{
	static int x=20;
	public static void main(String[] args) {
		System.out.println(new ABC().x);
		System.out.println( ABC.x);
		System.out.println(x);
		
	}
	
	
}









