import java.util.*;
import arithfun.Pkg;
class Client{

public static void main (String[] args)
{
    Scanner sc = new Scanner (System.in );
    int x= sc.nextInt();
    int y= sc.nextInt();

    Pkg p= new Pkg(x,y);

    System.out. println(p.add());

}
}