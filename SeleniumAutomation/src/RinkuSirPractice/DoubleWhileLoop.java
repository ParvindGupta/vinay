package RinkuSirPractice;

public class DoubleWhileLoop {
//........While-:First initialization then condition then execution then Increasement & Decreasement 
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			int j=0;
			while(j<=i) {
				System.out.print(j+"|");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
