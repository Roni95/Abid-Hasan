package CSE;

import java.util.Scanner;

class Polymorphism{
	public static void main(String[] args){

	Overload obj=new Overload();
	obj.sum(5,6);
	obj.sum(3,2,4);		
	}
}

class Overload{

	void sum(int a , int b){
		a=a+b;
		System.out.println(a);
	}

	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
