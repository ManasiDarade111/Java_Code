
import java.util.*;
public class EvenArray {

    static  int[] SetEventoOne(int arr [] ){
        int arr1[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[i]=1;
            }
        }
        return arr1;

    }

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt() ;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(SetEventoOne(arr)));



    }
}