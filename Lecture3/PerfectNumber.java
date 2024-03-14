/*
      Q] Perfect Number

          num = 6
              = 1 + 2 + 3
              = 6
*/

      import java.util.*;
   
    public class PerfectNumber
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
               int num, i, sum=0;

            System.out.println("\n Enter a num : ");
               num = s.nextInt();

             for(i=1 ; i<num ; i++)
             {
                 if(num % i == 0)
                 {
                     sum += i;
                 } 
             }  

           if(sum == num)
           {
              System.out.println("\n Perfect Number "); 
           }
           else
           {
              System.out.println("\n Not a Perfect Number "); 
           }
           s.close();
        }
    }

