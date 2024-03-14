/*
    Q] Tribonacci Series
         0   1   1   2   4   7....
         a   b   c   d

-----------------------------------------------
     Q] Fibonacci Series 
           0   1   1   2   3   4      
           a   b   c
*/

      import java.util.*;
   
    public class Fibonacci
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
               int a=0, b=1, c=1, i=1, n;
    
            System.out.println("\n Enter n : ");
              n = s.nextInt();

            System.out.println("\n Fibonacci Series : ");
              while(i <= n)
              {
                  System.out.print(" "+a); 
 
                    a = b;
                    b = c;
                    c = a+b;
                     i++;
              } 
              s.close();
        }
    }





