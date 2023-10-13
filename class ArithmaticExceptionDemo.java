class ArithmaticExceptionDemo 

{
    void m1(){

        System.out.println("starts m2");
        System.out.println("10/0");
  }

  void m2(){
      System.out.println("Start")
      m1();

  }


 public static void main (String [] args)
 {

    System.out.println("Start main");
    Demo obj = new Demo ();
    obj.m1();
    System.out.println("Main End");
        

        

 }


}