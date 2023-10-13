public class Hello {
  int x;
  int y;
    Hello(int x, int y){
        //System.out.println("In parameterised Constructor ");
        this.x=10;
        this.y=10;
        System.out.print(x);
        System.out.print(y);
    }
}
class Demo{
    public static void main(String[]  args){
       // System.out.println("Hello");
        Hello h = new Hello(10,20);
        



    }
}
    
