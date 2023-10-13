class OvrDemo
{
    OvrDemo()
    {
        System.out.println("in Parent Constructor");

    }
    void marry()
    {
        System.out.println("in Parent Marry");
    }
    void property()
    {
        System.out.println("in Parent Property");
    }
}
class Child extends OvrDemo{
    Child()
    {
        System.out.println("in Client Constructor");

    }
    void marry()
    {
        System.out.println("in Child Marry");
    }

}
class Client{
    public static void main (String[]args){
        OvrDemo d = new Child();
        d.marry();
        d.property();
    }
}