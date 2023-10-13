import java.util.*;
class VectorDemo{
    public static void main(String[] args){
    Vector v = new  Vector();
    v.addElement(10);
    v.addElement(20);
    v.addElement(30);
    v.addElement(40);
    //v.addElement(40);
    System.out.println(v.capacity());
    System.out.println(v.size());
    System.out.println(v.removeElement(30));
    System.out.println(v);
    v.addElement(30);
     System.out.println(v);







}
}