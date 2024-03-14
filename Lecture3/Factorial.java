/*
     Q] Factorial
           5! = 5*4*3*2*1 = 120
*/

      import java.util.*;
   
    public class Factorial
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
               int num, i, fact=1;

            System.out.print("\n Enter a num : ");
               num = s.nextInt();

               for(i=num ; i>=1 ; i--)
               {
                   fact = fact * i;
               }
            System.out.print("\n Factorial = "+fact);
            s.close();
        }
    }

