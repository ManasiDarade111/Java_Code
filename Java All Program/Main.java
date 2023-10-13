import java.util.*;
import java.lang.*;
public class Main{
public static void main(String[] args)
{
int arr[]={4,2,5,3,7};
//int len=arr.length;
 for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }  
}   
//alternat element in array
for(int j=0;j<arr.length;j+=2)
{
System.out.print(arr[j] + " ");
}
}
}
