/*
      Q] Find x raised to y using for loop

            x = 2
            y = 3

           ans = 2*2*2 = 8
*/

      import java.util.*;
   
    public class Power
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
               int x, y, i, ans=1;

            System.out.println("\n Enter x : ");
               x = s.nextInt();

            System.out.println("\n Enter y : ");
               y = s.nextInt();

            for(i=1 ; i<=y ; i++)
            {
                ans = ans * x;
            }  

            System.out.println("\n Answer = "+ans);
            s.close();
        }
    }


