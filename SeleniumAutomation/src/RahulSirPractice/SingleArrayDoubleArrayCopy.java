package RahulSirPractice;

public class SingleArrayDoubleArrayCopy {

	public static void main(String[] args) {
	String[] arr=new String[2];
	arr[0]="Suraj May tumhe pel dunga";
	arr[1]="Mukesh I will fuck you";
	String[] arr1=new String[4];
	for(int i=0;i<=arr.length-1;i++) {
		arr1[i]=arr[i];
		String aa=arr1[i];
	System.out.println(aa);
	}
	String[] arr2=new String[6];
	for(int i=0;i<=arr1.length-1;i++) {
		arr2[i]=arr1[i];
	}
	String[] arr3=new String[10];
	for(int i=0;i<=arr2.length-1;i++) {
		arr3[i]=arr2[i];
	}
	String[] arr4=new String[15];
	for(int i=0;i<=arr3.length-1;i++) {
		arr4[i]=arr3[i];
	}

	}

}
