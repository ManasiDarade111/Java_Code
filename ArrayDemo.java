
import java.util.*;

class ArrayDemo
{
	
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int n;
		System.out.println("Enter any 5  Element" );
		int array[]= new int[5];
		n= sc.nextInt();
		
		for(int i=0; i<array.length; i++)
		{
			
			array[i]=sc.nextInt();
			
		}
		for(int i=0; i<array.length; i++)
		{
			
			System.out.println("Array " + array[i]);
			
		}
		
	}
	
	
}