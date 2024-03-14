/*
        Q] Armstrong Number  
              
             num = 153
                 = 1cube + 5cube + 3cube 
                 =  1 + 125 + 27
                 = 153  
*/

        import java.util.*;
   
    public class ArmstrongNumber
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
              int num, rem, sum=0, temp;

            System.out.println("\n Enter a num : ");
               num = s.nextInt();
  
                temp = num; 

               while(num > 0)
               {
                   rem = num % 10;
                   sum = sum + (int)Math.pow(rem, 3);
                   num = num / 10;
               }

            if(temp == sum)
            {
                System.out.println("\n Armstrong Number ");
            }
            else
            {
                System.out.println("\n Not an Armstrong Number ");
            }
            s.close();
       }
    }

