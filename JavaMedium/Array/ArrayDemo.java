// Give array of size n . Print All the Element
import java.util.*;

public class ArrayDemo {
    public static void main (String[] args){
        System.out.println("Enter Number Of Array Element");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
         System.out.println(" Number Of Array Element is "+ N);

            int arr[]=new int[]{10,20,30,40,50,60};
           for (int i=0; i<N; i++){
           System.out.println(arr[i]);
     }
    
}
}
