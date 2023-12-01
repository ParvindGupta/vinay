package RinkuSirPractice;

public class Array_DounleArray {

	public static void main(String[] args) {
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		int[] arr3=new int[5];
		
		arr1[0]=11;
		arr1[1]=22;
		arr1[2]=33;
		arr1[3]=44;
		arr1[4]=55;
		
		arr2[0]=11;
		arr2[1]=22;
		arr2[2]=33;
		arr2[3]=44;
		arr2[4]=55;

		arr3[0]=11;
		arr3[1]=22;
		arr3[2]=33;
		arr3[3]=44;
		arr3[4]=55;
		
		System.out.println(arr1.clone());
		int myArray[][]=new int[3][5]	;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(myArray[i][j]);
			}
		}
		
	}
}
