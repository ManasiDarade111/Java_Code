class Factorial {
    public static void main(String [] args ){
   int n=256946;
   int rem;

        
     while(n !=0){ 
        
         int fact=1;
          rem=n%10;

        if(rem %2==0){

          for(int i=1; i<=rem; i++){

            fact=fact*i;
          }
          System.out.print(fact + " , ");


     }
     n=n/10;
    }
    
}
}
