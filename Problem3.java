package CSE;

import java.util.Scanner;

class Problem3{
	public static void main(String[] args){
	Scanner n=new Scanner(System.in);
	Students n0=new Students();
	Students n1=new Students("netinfo",25);
	Students n2=new Students("netinfo",18,"Faridpur"); 
	}
}

class Students{
	int age;
	String name;
	String Address;
	Students(){
		name="Unknown";
		age=0;
		Address="not available"; 
		System.out.println("Name : "+name+" Age : "+age+" Address : " +Address);
 	}
	Students(String name, int age ){
		System.out.println("Name : "+name+" Age : "+age);
	}
	
	Students(String name, int age , String Address ){
		System.out.println("Name : "+name+" Age : "+age+ " Address : "+Address);
	}
}
