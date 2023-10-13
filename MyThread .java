public class MyThread extends Thread{
public void run()
{
      System.out.println(getName());
      System.out.println(Thread.currentThread().getThreadGroup());


}

}

class ThreadGroupDemo{
    public static void main (String[] args)throws InterruptedException
    {

        MyThread obj = new MyThread("xyz");
        obj.start();
    }


}

