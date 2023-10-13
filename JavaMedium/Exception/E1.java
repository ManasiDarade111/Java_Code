
public class E1{
    void m1()
    {
        System.out.println(10/0);
        
    }
    void m2()
    {
        System.out.println("No Exception")
        
    }
    public static void main (String [] args)
    {
        E1 ob = new E1();
        ob.m1();
        ob.m2();
    }

}