/* 
       Q] Reverse an array

          0   1   2    3   4 
x         10  20  30   40  50

          0   1   2    3   4 
x         50  40  30   20  10
------------------------------------------------------
           int i,j, temp;

      for(i=0,j=size-1 ; i<size/2 ; i++,j--)
      {
          temp = x[i];
          x[i] = x[j];
          x[j] = temp; 
      }   
*/

      import java.util.*;
   
    public class Array8
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int size, i, j, temp;
             
           System.out.println("\n Enter size : ");
              size = s.nextInt();

            int [] x = new int[size];

          System.out.println("\n Enter nums : ");
              for(i=0 ; i<size ; i++)
              {
                  x[i] = s.nextInt();
              }

      for(i=0,j=size-1 ; i<size/2 ; i++,j--)
      {
          temp = x[i];
          x[i] = x[j];
          x[j] = temp; 
      }   

           System.out.println("\n List after reverse : ");
               for(int a : x)
               {
                  System.out.print(" "+a); 
               } 
               s.close();
        }
    }

