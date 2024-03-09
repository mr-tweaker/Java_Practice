/*
    HOMEWORK
      Q] WAP to check entered char is vowel or not.
*/

      import java.util.*;
   
    public class SwitchDemo1
    {
        public static void main(String [] args)
        {
           Scanner s = new Scanner(System.in);
              int a, b, choice;

           System.out.println("\n Enter 2 nums : ");
              a = s.nextInt();
              b = s.nextInt();
  
         System.out.println(" 1] ADD ");
         System.out.println(" 2] SUB ");
         System.out.println(" 3] MUL ");
         System.out.println(" 4] DIV ");

       System.out.println("\n Enter your choice : ");
          choice = s.nextInt();

          switch(choice)
          {
              case 1:
                      System.out.println("\n ADD = "+(a+b));
                           break;
              case 2:
                      System.out.println("\n SUB = "+(a-b));
                           break;
              case 3:
                      System.out.println("\n MUL = "+(a*b));
                           break;
              case 4:
                      System.out.println("\n DIV = "+(a/b));
                           break;
              default:
                      System.out.println("\n INVALID INPUT ");
          }
          s.close();
        }
    }
