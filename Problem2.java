package CSE;

import java.util.Scanner;

class Problem2{
	public static void main(String[] args){
	int x,y,z;
	Scanner n=new Scanner(System.in);
	System.out.println("Enter Length breath of a rectangle and side of a square  : ");
	x=n.nextInt();
	y=n.nextInt();
	z=n.nextInt();
	Overload obj=new Overload();
	obj.sum(x,y);
	obj.sum(z);		
	}
}

class Overload{

	void sum(int a , int b){
		float ans=(float).5*(float)a*(float)b;
		System.out.println("The rectangle is :"+ans);
	}

	void sum(int a){
		System.out.println("Area of the Square is : "+(a*a));
	}
}
