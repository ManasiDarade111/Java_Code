class My extends Thread {
    public void run(){
        System.out.println(getName());
        System.out.println(Thread.currentThread(). getThreadGroup());


    }
}

class ThreadGroup{
    public static void main (String[] args){
        My obj = new My("XYZ");
        obj.start();
    }

}