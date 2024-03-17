/*
  Q] Insertion in sorted aray

  Enter size : 5

  Enter nums : 

     0 10
     1 20
     2 30  <-pos 
     3 40
     4 50
size=5  

 Enter num to be inserted : 60

   List after insertion :    
   10  20  25  30  40  50
*/

      import java.util.*;
   
    public class Array5
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int size, i, num, pos;
             
           System.out.println("\n Enter size : ");
              size = s.nextInt();

                pos = size;

            int [] x = new int[size+1];

          System.out.println("\n Enter nums (in asc order) : ");
              for(i=0 ; i<size ; i++)
              {
                  x[i] = s.nextInt();
              }

        System.out.println("\n Enter num to be inserted : ");
              num = s.nextInt();

          for(i=0 ; i<size ; i++)
          {
              if(num < x[i])
              {
                  pos = i;
                  break;
              }  
          }

           for(i=size ; i>pos ; i--)
           {
               x[i] = x[i-1];
           }

                x[pos] = num;  // INSERT

        System.out.println("\n List after insertion : ");
           for(i=0 ; i<=size ; i++)
           {
              System.out.print(" "+x[i]);
           } 
           s.close();
        }
    }
