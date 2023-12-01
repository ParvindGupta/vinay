package Parameter_Arguments;

public class abcReturn {	
	int z =8;
public static char sum(int a, int b) {
	System.out.println("a= "+a+" b= "+b);
	
	return 'A';
}
public static char sum1() {
	String s="hello"+sum(1,3);
	return 'A';
}
	public static void main(String[] args) {
int a =34;
int b =56;
String c = sum(3,6)+sum1()+"hello";
System.out.println(" c= "+c);
		
	}
}
