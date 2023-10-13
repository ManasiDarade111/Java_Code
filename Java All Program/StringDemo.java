import java.io.*;

class StringDemo{

public static myFunction(String str1,String str2)


{
     char arr1 = str1.toCharArray();
     char arr2 =str2.toCharArray();


    int count1=0;
    int count2=0;

for (int i=0; i<arr1.length; i++)

{
   count1++;

}

for (int i=0; i<arr2.length; i++)

{
   count2++;

}
int len;
if(count1>count2)
{
 
len = count1;
}

else{
 
len = count2;
}
for(int i=0; i<len ; i++)
{
 if(arr1[i]!=arr2[i])
 {

    return arr1[i]-arr2[i];

}
}

return 0;
}

public static void main(String[] args)throws IOException{

BufferReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter first String");
String str1 =br.readLine();

System.out.println("Enter Seccond  String");
String str2 =br.readLine();

int compare =myFunction(str1,str2);
System.out.println(compare);

}

}


