import java.util.*;
import java.lang.*;
public class Main{
public static void main(String[] args)
{
int arr[]={4,2,5,3,7};
int len=arr.length();
for(int i=0;i<=len-1;i++)
{
int temp;
if(arr[i]>arr[i+1]){
    temp=arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;
}
}
//alternat element in array
for(int j=0;j<=len-1;j++)
{
System.out.print(arr[j] + "");
}
}
}
