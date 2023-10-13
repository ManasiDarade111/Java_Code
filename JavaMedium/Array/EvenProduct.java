import java.util.*;

public class EvenProduct {
    public static int calculateProduct(int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = calculateProduct(arr);
        
        System.out.println("The product of numbers in the array is: " + result);
    }
}
