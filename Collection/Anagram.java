import java.util.*;

public class Anagram {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First string ");

        String str1 =sc.nextLine();
       System.out.print("Enter Second String ");
        
        String str2 =sc.nextLine(); 

        if(isana(str1, str2)){
             System.out.println(" String is anagram");
        }
             else {
             System.out.println(" String is Not anagram");

             }
        

          sc.close();
        
    }

    



    
public static boolean isana(String str1 ,String str2){

    str1 = str1.replaceAll("//s " , " " ).toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();


    if(str1.length() != str2.length()){
        return false; 
    }

    char[] chararray1 =str1.toCharArray();
    
    char[] chararray2 =str2.toCharArray();

    Arrays.sort(chararray1);
    Arrays.sort(chararray2);
    
  return Arrays.equals( chararray1,chararray2);

}
}
