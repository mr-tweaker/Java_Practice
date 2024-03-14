/*
     Q] Prime Number 

           num = 11
        2-------------10

           num = 15
        2-------------14
*/

      import java.util.*;
   
    public class PrimeNumber
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
               int num, i;
               boolean flag=true;

            System.out.print("\n Enter a num : ");
               num = s.nextInt();
             
              for(i=2 ; i<num ; i++)
              {
                  if(num % i == 0)
                  {
                      flag = false;
                        break;
                  }
              }
 
         if(flag == true)
         {
             System.out.println("\n PRIME NUMBER "); 
         }
         else
         {
             System.out.println("\n NOT PRIME NUMBER "); 
         }
         s.close();
        }
    }
