/*
        Q] Palindrome Number  
              
             num = 1221
*/

      import java.util.*;
   
    public class PalindromeNumber
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
              int num, rem, rev=0;

           System.out.println("\n Enter a num : ");
              num = s.nextInt();
 
               int temp = num;

               while(num > 0)
               {
                   rem = num % 10;
                   rev = (rev * 10) + rem;
                   num = num / 10;
               }

             if(temp == rev)
             {
                System.out.println("\n Palindrome Number ");
             } 
             else
             {
                System.out.println("\n Not a Palindrome Number ");
             }
             s.close();
        }
    }

