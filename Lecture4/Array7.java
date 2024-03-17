/*
 
  Q] Ascending Sort

  Enter size : 5

  Enter nums : 

     0 50 <-i=0
     1 40 <-j=i+1
     2 30  
     3 20
     4 10

             int i,j,temp;

         for(i=0 ; i<size ; i++)
         {
             for(j=i+1 ; j<size ; j++)
             {
                 if(x[i] > x[j])
                 {
                     temp = x[i];
                     x[i] = x[j];
                     x[j] = temp;
                 } 
             } 
         }

*/

      import java.util.*;
   
    public class Array7
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

         for(i=0 ; i<size ; i++)
         {
             for(j=i+1 ; j<size ; j++)
             {
                 if(x[i] > x[j])
                 {
                     temp = x[i];
                     x[i] = x[j];
                     x[j] = temp;
                 } 
             } 
         }

           System.out.println("\n List after sort : ");
               for(int a : x)
               {
                  System.out.print(" "+a); 
               } 
               s.close();
        }
    }

