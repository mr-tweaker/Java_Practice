/*
       'A' = Upper case
       'a' = Lower case
       '4' = Digit
       '#' = Special char   
*/

      import java.util.*;
   
    public class IfDemo4
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
 
          System.out.println("\n Enter a char : ");
            char ch = s.next().charAt(0); 
          
        if(ch >= 'A' && ch <= 'Z')
        {
           System.out.println("\n UPPER CASE ");
        }
        else if(ch >= 'a' && ch <= 'z')
        {
           System.out.println("\n LOWER CASE ");
        }
        else if(ch >= '0' && ch <= '9')
        {
           System.out.println("\n DIGIT ");
        }
        else
        {
           System.out.println("\n Special char ");
        }
        s.close();
        }
    }

