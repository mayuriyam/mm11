import java.io.*;
import java.util.*;
class alphabet
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        char b=sc.next().charAt(0);

        if(b>'a'||b<'z')
        {
            System.out.println("is alphabet");

        }
        else
        {
           System.out.println("not alphabet"); 
        }
        
        
    }
}
