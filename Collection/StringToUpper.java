import java.util.*;

public class StringToUpper {
    public static void main(String[] args ){
        System.out .println("Enter String ");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        String input=str.toUpperCase();
        System.out.println(input);
        sc.close();
    
    
    }
    
}
