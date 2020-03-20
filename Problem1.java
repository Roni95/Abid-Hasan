package CSE;

import java.util.Scanner;

class Problem1{
	public static void main(String[] args){
	Scanner n=new Scanner(System.in);
	int x;
	char y;
	System.out.println("Enter an Integer and a Character : ");
	x=n.nextInt();
	y=n.nextChar();
	Overload obj=new Overload();
	obj.sum(x,y);
	obj.sum(y,x);		
	}
}

class Overload{

	void sum(int a , char b){
		System.out.println("number is : "+a+" Character is : "+b);
	}

	void sum(char a , int b){
		System.out.println("Character is : "+a+" Number is : "+b);
	}

}
