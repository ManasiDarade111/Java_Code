public class MyThreadd extends Thread{

public void run()
{
      System.out.println(getName());
      System.out.println(Thread.currentThread().getThreadGroup());


}

}
class ThreadGroup{
    public static void main (String[] args)
    {

        MyThreadd obj = new MyThreadd("xyz");
        obj.start();
    }


}

