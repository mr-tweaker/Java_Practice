  
    public class BreakDemo2
    {
        public static void main(String [] args)
        {
             int i, j;

       outer:for(i=1 ; i<=5 ; i++)
             {
                 for(j=1 ; j<=5 ; j++) 
                 {
                     System.out.print(" * ");

                     if(j == 3)
                     {
                          break outer;
                     }
                 }  
                     System.out.print("\n");
             }  
        }
    }

