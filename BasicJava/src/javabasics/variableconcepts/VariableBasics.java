package javabasics.variableconcepts;
public class VariableBasics {
	public static void main(String[] args) {
		int age;     
		int salary;
		age=50;   
		salary=age*1000;
		System.out.println(salary);
		findArea();
		findSpeed();
	}
	public static void findArea() {
		int length; 
		int width;  
		int area;
		int num=0;
		length = 890;
        length = length+300;
        System.out.println(length);
        int x =  10; 
        x  =  x*5;   
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        if(x == 1000) { 
        	System.out.println("Rahul");
        }
		System.out.println(length);
		System.out.println(length);
		System.out.println(length);
		width = 234;  	
		length=10;   	
		System.out.println(length);		
		area=length*width;   
		System.out.println(area);
		System.out.println(length);
	}
	public static void findSpeed() {
		int time; 
		int distance;  
		int speed;
		time=20;
		distance=1000;
		speed=distance/time;
		System.out.println(speed);
	}
}
