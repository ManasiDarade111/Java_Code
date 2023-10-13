class Mythread3 extend Thread {
    MyThread3(String str)
    {
        super(str);

    }
       public  void run()
       {
        System.out.println(getName());

        System.out.println(Thread.currentThread().getThreadGroup());
       }

}
class Thread{
public static void main(String[] args )
{
    MyThread3 m= new MyThread3();
    
}
}