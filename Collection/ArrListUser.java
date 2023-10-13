import java.util.*;

public class ArrListUser {
    int jer_no= 0;
    String Name = null;

    ArrListUser(int jer_no, String Name ){
       this.jer_no=jer_no;
       this.Name=Name;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
class ArrayListDemo{

    public static void main (String aergs[]){

        ArrayList al = new ArrayList<String>();
        al.add(new ArrListUser ( 18, " Virat Kohli  ") );
      
        al.add(new ArrListUser (7, " Dhoni ") );
        System.out.println(al);
    }
}
