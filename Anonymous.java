import java.util.*;
class Anonymous{
    void fun(){

        System.out.println("Hello");


    }
    
}
class Client
{
    public static void main (String [] args){

  Anonymous c = new Anonymous(){

     void fun(){

        System.out.println("Hello");


    }
 
   
    };
     c.fun();
}
}
