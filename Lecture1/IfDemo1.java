
      import java.util.*;
   
    public class IfDemo1
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int a,b;

         System.out.println("\n Enter 2 nums : ");
             a = s.nextInt();
             b = s.nextInt();

          if(a>b)
          {
             System.out.println("\n max = "+a); 
          } 
          else
          {
             System.out.println("\n max = "+b); 
          } 
          s.close();
        }
    }

