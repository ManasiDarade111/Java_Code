class MyThreadd extend Thread{

public void run{
      System.out.println(getName());
      System.out.println(Thread.currentThread().getThreadGroup());
      

}

}
class ThreadGroup{
    public static void main (String[] args)
    {

        MyThread obj = new MyThread ("xyz");
        obj.start();
    }


}

