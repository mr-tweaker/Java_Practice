/*
     HOMEWORK
         Q] num = 1226
             even = 3
             odd = 1     

             num = 1234
             even = 2
             odd  = 2

     HOMEWORK
      Q] WAP to convert decimal into binary
               num = 4     bin = 100
               num = 5     bin = 101
               num = 7     bin = 111 
---------------------------------------------
        Q] Count Digits  
              
             num = 153
             count = 3

             num = 1234
             count = 4
*/

        import java.util.*;
   
    public class CountDigits
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
              int num, count=0;

            System.out.println("\n Enter a num : ");
               num = s.nextInt();

               while(num > 0)
               {
                   count++;
                   num = num / 10;
               }

             System.out.println("\n count = "+count);
             s.close();
       }
    }

