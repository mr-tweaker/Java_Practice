/*
     HOMEWORK
  Q] WAP to find largest and second largest number in a given array.
     example : 
              x[] = {1,2,3,4,2,3,4,5,2,3,4,5,5} 

                     max = 5
                     max2 = 4
*/

      import java.util.*;
   
    public class Array3
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int size, i, max, min;

           System.out.println("\n Enter size : ");
             size = s.nextInt();

            int [] x = new int[size];

          System.out.println("\n Enter nums : ");
              for(i=0 ; i<size ; i++)
              {
                  x[i] = s.nextInt();
              }

                  min = max = x[0];

              for(i=1 ; i<size ; i++)
              {
                  if(min > x[i])
                  {
                     min = x[i];
                  } 
 
                  if(max < x[i])
                  {
                     max = x[i]; 
                  } 
              }

               System.out.println("\n min = "+min);
               System.out.println("\n max = "+max);
               s.close();
        }
    }
