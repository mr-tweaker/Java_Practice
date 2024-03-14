
      import java.util.*;
   
    public class ForLoop2
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
               int num, i;
            System.out.print("\n Enter a num : ");
               num = s.nextInt();

              for(i=1 ; i<=10 ; i++)
              {
                  System.out.println(num * i);
              }
              s.close();
        }
    }

