/*
        Q] Reverse Number  
              num = 123
              rev = 321 
*/

      import java.util.*;
   
    public class ReverseNumber
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
              int num, rem, rev=0;

           System.out.println("\n Enter a num : ");
              num = s.nextInt();

               while(num > 0)
               {
                   rem = num % 10;
                   rev = (rev * 10) + rem;
                   num = num / 10;
               }

           System.out.println("\n Reverse = "+rev);
           s.close();
        }
    }

