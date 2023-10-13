import java.util.*;
public class Array1 {
    // Give array of size n . Count number of element having at least 1 element grater than itself
    public static void main (String[] args){
        System.out.println("Enter Number Of Array Element");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
         System.out.println(" Number Of Array Element is "+ N);

            int arr[]=new int[]{1,20,6,4,90,60,4,5,9,10};
            int count=0;
            
            for (int i=0; i<N; i++){
           for (int j=0; j<N; j++){


           System.out.println(arr[j]);
           }
     }
    }
    
}



    

