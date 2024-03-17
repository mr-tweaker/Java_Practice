/*
    Q] linear Search

  Enter size : 5

  Enter nums : 

  ->0 10
    1 23
    2 15 <-pos=3
    3 45
  ->4 35

 Enter num to be searched : 123 
                             
    NUM NOT FOUND
*/

      import java.util.*;
   
    public class Array4
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int size, i, num, pos=0;
             
           System.out.println("\n Enter size : ");
              size = s.nextInt();

            int [] x = new int[size];

          System.out.println("\n Enter nums : ");
              for(i=0 ; i<size ; i++)
              {
                  x[i] = s.nextInt();
              }

        System.out.println("\n Enter num to be searched : ");
              num = s.nextInt();

           for(i=0 ; i<size ; i++)
           {
               if(num == x[i])
               {
                   pos = i+1;
                    break;
               }   
           } 

         if(pos == 0)
         {
            System.out.println("\n NUM NOT FOUND ");  
         }  
         else
         {
            System.out.println("\n pos = "+pos);  
         } 
         s.close();          
        }
    }
