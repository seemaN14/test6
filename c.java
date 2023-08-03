import java.io.*;
import java.util.*;
public class c 
{
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
         while(s.hasNextLine())
          {

            s.nextLine();
            System.out.println("Enter the radius:");
             double r= s.nextDouble();
           double  area=(22*r*r)/7 ;
           System.out.println("Area of Circle is: " + area);
             }    
    }            
}