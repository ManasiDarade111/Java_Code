class Outer{
  

      void m1(){ 
        void m2(){

            class Xyz{
                 void m3(){
                System.out.println("In Inner");
                 }
             } 
               Xyz x = new Xyz();
               x.m3();
        }

             

    }
      

      
}

class Client
{
      public static void main (String args[])
      {
           Outer o = new Outer();    
           o.m1();
           

      }
}