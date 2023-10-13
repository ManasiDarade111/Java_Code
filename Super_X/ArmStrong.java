import java.util.*;
public class ArmStrong {
  public static void main(String[] args){
     System.out.println(" enter any number  ");
  Scanner sc =new Scanner(System.in);
   int n= sc.nextInt();
  int arm=0;
   int  c= n; 
   int rem;
    while(n>0){
        rem=n%10;
        arm=(rem*rem*rem)+arm;
          n= n/10;
        

    }
    if (arm==c){
        System.out.println("number is Armstrong Number ");
    }
    

  }
 
    
}
