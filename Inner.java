class Outer {
    class Inner{
  void m1(){
      System.out.println("In m1-Interface");

     }
}
void m2(){
System.out.println("In m1");

}
class Client{
public static void main (String[] args){

Outer obj = new Outer();
obj.m2();
}
}
}