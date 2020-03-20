package CSE;

import java.util.Scanner;

public class Inheritance{
	public static void main(String[] args){
		Second obj=new Second();
		System.out.println("Roll : "+obj.roll+"  Name : "+obj.name+"  Number :"+obj.number); 
	}
}


public class First{
	int roll=2623;
	String name="Roni";
}


public class Second extends First{
	int number=695;
}
