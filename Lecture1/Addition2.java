import java.util.Scanner;

    public class Addition2
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
             int a,b,c;

           System.out.println("\n Enter 2 nums : ");
              a = s.nextInt();
              b = s.nextInt();

              c = a+b;

           System.out.println("\n Addition = "+c);

           s.close();
        }
    }

