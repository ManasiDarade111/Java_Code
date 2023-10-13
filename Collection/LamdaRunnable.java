//import java.util.*;
class LamdaRunnable{

   public static void main(String[] args){
    Runnable ob = new Runnable(){
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    };
    Runnable ob2= new Runnable(){
        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
    };

   
    Thread t1 =new Thread(ob);
    t1.start();
    Thread t2 =new Thread(ob2);
    t2.start();


   }
}