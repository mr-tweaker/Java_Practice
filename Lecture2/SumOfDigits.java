/*
        Q] Sum of digits  
              
             num = 123
                 = 1+2+3 
                 = 6
*/

        import java.util.*;
   
    public class SumOfDigits
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
              int num, rem, sum=0;

            System.out.println("\n Enter a num : ");
               num = s.nextInt();
 
               while(num > 0)
               {
                   rem = num % 10;
                   sum += rem;
                   num = num / 10;
               }

           System.out.println("\n sum of digits = "+sum); 
           s.close();  
       }
    }
