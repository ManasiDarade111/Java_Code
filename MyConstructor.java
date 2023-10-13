class MyConstructor extends Thread {

    MyConstructor(String str)
    {
        super(str);
    }
    public void run(){
        System.out.println(getName());
        System.out.println(Thread.currentThread(). getThreadGroup());


    }
}

class ThreadGroup{
    public static void main (String[] args)
    {
        MyConstructor obj = new MyConstructor("XYZ");
        obj.start();
    }

}