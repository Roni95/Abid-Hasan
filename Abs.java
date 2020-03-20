package Java;
import java.util.Scanner;
//This is a abostract test program
public class Abs{
    public static void main(String[] args){
        Sup obj=new Sup();
        obj.CSE();
        obj.Roni();
        obj.roll=10;
        System.out.println("X ="+obj.roll);
    }
}

abstract class Display{
    abstract void Roni();
}


class Sub extends Display{
    public int roll;
    void Roni(){
        System.out.println("This is a abstact function");
    }
}

class Sup extends Sub{
    void CSE(){
        System.out.println("Hey");
    }
}


