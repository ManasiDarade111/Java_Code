import java.util.Scanner;

class ModuleDemo{

    public static  int Add(int x, int y)
    {
        int sum = x + y;   
        return sum;
    }




    public static void main (String args[]){
       // ModuleDemo m =  new ModuleDemo();
      
       Scanner sc = new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();


        int sum = Add(x,y);
        System.out.println(sum);


    }

}
