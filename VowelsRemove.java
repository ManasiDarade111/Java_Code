import java.util.*;

class VowelsRemove{
    public static void main (String[] args){
        String str,str1;
     
        System.out.println("Enter String");
        Scanner sc= new Scanner(System.in);
        str= sc.nextLine();

        str1= str.replaceAll("[aeiouAEIOU]" , "");
        System.out.println("Vowel Remove  String " );
        System.out.println(str1);
        



    
        

    }
}