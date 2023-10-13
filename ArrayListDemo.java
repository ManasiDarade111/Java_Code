import java.util.*;


class ArrayListDemo  extends ArrayList {
      public static void main(String[] args)
{
      ArrayList  al =  new ArrayList();
     al.add(10);
     al.add(20.5f);
     al.add("ABC");
     al.add("XYZ");

     System.out.println(al); 

     // size

    System.out.println(al.size());
    //System.out.println(al.contain(10));