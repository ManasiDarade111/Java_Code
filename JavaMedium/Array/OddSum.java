
   import java.util.*;
   public class OddSum {

   public static int sum(int x){
    int arr[]={1,2,3,4,5};
    int s=0;

      for(int i=0;i<arr.length;i++)

    {
        if(arr[i]%2==1){
           s += arr[i];
    
        }
    }
     return s;
  }
    public static void main (String [] args)
    {
        System.out.println("Enter Any Number of array ");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
       
        System.out.println(OddSum.sum(s));
        
    }
    
}
