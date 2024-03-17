  
    public class ContinueDemo2
    {
        public static void main(String [] args)
        {
             int i, j;

       outer:for(i=1 ; i<=5 ; i++)
             {
                 for(j=1 ; j<=5 ; j++) 
                 {
                     if(j>3)
                     {
                         continue outer;
                     }

                     System.out.print(" * ");
                 }  
                     System.out.print("\n");
             }  
        }
    }

