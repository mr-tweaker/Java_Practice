
      import java.util.*;
   
    public class IfDemo3
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int num;

         System.out.println("\n Enter a num : ");
             num = s.nextInt();

           if(num % 2 == 0)
           {
              System.out.println("\n EVEN ");
           }  
           else
           {
              System.out.println("\n ODD ");
           }   
           s.close();
        }
    }

