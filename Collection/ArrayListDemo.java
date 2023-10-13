/* Array list is collection of Different or hetrerogeneous type of data 
where it is not similar as normal array becz :
1 . It does not have fixed size 
2. Any type of data  cann be stored 
3.  has many method which is inbuild so we can use it easily 
4. ArrayList and aary both allw Dublicate data*/ 

import java .util.*;

public class ArrayListDemo {
    public static void main(String [] args)
    {
       ArrayList al = new ArrayList<>();                   
       al.add(10);
        al.add(20.f);
        al.add("Manasi");
         al.add(200000);
          al.add("Manasi");
         al.add(200000);  // add data 

        /* for(int x : al){
            System.out.println(x.getClass().getName());
        }}*/ 
        System.out.println(al);

        System.out.println(al.remove(3)); // remove Third element 
        System.out.println(al);

         System.out.println(al.size());  // size method of array list 

         System.out.println(al.isEmpty()); // check it is empty or not

         System.out.println(al.contains(10)); // element is contain or not 

         System.out.println(al.indexOf(10));  //find index of element 

         System.out.println(al.lastIndexOf(al)); // last index of array

          System.out.println(al.get(2));// get element from  idex 

          ArrayList al2 = new ArrayList(); // created another array list 


         System.out.println(al2.add("saloni"));//add element
         
         System.out.println(al2.add("10"));
         
         System.out.println(al2.add("Khushi"));
         
         System.out.println(al2.add("Pratiksha "));

         System.out.println(al2);//print 
         al.addAll(al2);  // add element of al2 in al
         
         System.out.println(al);
         

   }

}
