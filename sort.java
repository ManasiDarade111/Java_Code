import java.util.*;
import java.lang.*;
public class sort{
public static void main(String [] args)
{
int arr[]={3,2,0,1,7,8,9,6};
int i;
int len=arr.length;
for(i=0;i<=len-1;i+=2)
{
int temp=0;
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
for(int j=0;j<=len-1;j++)
{
System.out.println(arr[j]);
}
}
}