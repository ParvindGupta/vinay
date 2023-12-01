package RahulSirPractice;

import java.util.ArrayList;

public class ArrayList1 {
//	arrayList minimum lenth pahel se 10 hota hai.
// .....add--:add methad is a part of arrayList And add
	//add is arre list method. thish method use for add the value in arra list.
	//get method is use for call or get the value of arrea list.it is pearametrised method in perameter it is want index no.
	public static void main(String[] args) {
		ArrayList <String> ab = new ArrayList<String>();
		ab.add("Mr.");
		ab.add("My name is Parvind Gupta");
		ab.add("MY father name is Mr. Mahajan Gupta");
		ab.add("I am from India ,UP,Bhadohi,Mondh bazar");
		ab.add("I am Study B.com in Allahabad universiti");
		ab.add("My hobby Playing Cricket");
		ab.add("That's all my self");
		for(int i=0;i<=5; i++) {
			System.out.println(ab.get(i));
		}
		System.out.println(ab.get(0));
	}


}
