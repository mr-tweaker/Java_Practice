/*
      Q] Find Square Root using for loop

         num = 25
         ans = 5

         num = 36
         ans = 6
*/

       import java.util.*;
   
    public class SquareRoot
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
              int num, i, ans=1;

           System.out.println("\n Enter a num : ");
              num = s.nextInt();

            for(i=1 ; i<num ; i++)
            {
                if(i*i == num)
                {
                    ans = i;
                     break;  
                }
            }    

           System.out.println("\n Answer = "+ans);
           s.close();
        }
    }
