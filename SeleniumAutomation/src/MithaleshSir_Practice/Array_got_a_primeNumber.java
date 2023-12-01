package MithaleshSir_Practice;

public class Array_got_a_primeNumber {

	public static void main(String[] args) {
		int[] ar  = {1,7,5,8,9,10,13,17,11,18,15,20};
		int count=0;
	for (int i=0;i<ar.length-1; i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(i%j==0)  {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime Number");
		}else {
			System.out.println("Not Prime number");
		}
		
	
	}
	}

}
