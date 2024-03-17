
      import java.util.*;
   
    public class Array2
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int size, i, sum=0;

           System.out.println("\n Enter size : ");
             size = s.nextInt();

            int [] x = new int[size];

          System.out.println("\n Enter nums : ");
              for(i=0 ; i<size ; i++)
              {
                  x[i] = s.nextInt();
                    sum += x[i];
              }

          System.out.println("\n sum = "+sum);
          s.close();
        }
    }

