import java.util.Scanner;

public class EvenSum {
    static int sum(int x){
        int arr[]= { 1,2,3,4,5,6,7,8,9};
         int s=0;
        
         for(int i=0; i<arr.length;i++){
       if(arr[i]%2==0){
         s+=arr[i];
        
       }
      
    }
     return s;
}

    
    public static void main(String[] args){
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(EvenSum.sum(s));



    
    }
    
}
