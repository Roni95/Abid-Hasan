package CSE;

import java.util.Scanner;

class Problem4{
	public static void main(String[] args){
	int x,y,z;
	Scanner n=new Scanner(System.in);
	System.out.println("Enter Three number : ");
	x=n.nextInt();
	y=n.nextInt();
	z=n.nextInt();
	Overload obj=new Overload();
	System.out.println("Summation of first two number : ");
	obj.sum(x,y);
	System.out.println("Summation of three number : ");
	obj.sum(x,y,z);		
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
