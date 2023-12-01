package MithaleshSir_Practice;

public class Prime_Number {

	public static void main(String[] args) {
		//Question => Write the program  to print the prime number between 1 to 100..?

		int i,j;
		
		for( i=1;i<=100;i++) {

			for(j=2;j<i;j++) {
				if(i%j==0) 
				break;
			}
			if(i==j) {
				System.out.println(i);
			}
		}

	}

}
