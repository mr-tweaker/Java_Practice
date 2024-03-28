/*
      ASCII - American Standard Code For Information Interchange

           A = 65      a = 97
           B = 66      b = 98
           C = 67      c = 99
*/   

    public class CompareToIgnoreCase
    {
        public static void main(String [] args)
        {
             String s1 = "Computer";
             String s2 = "computer";
 
             int i = s1.compareToIgnoreCase(s2);
 
            System.out.println("\n i = "+i);

            if(i == 0)
            {
               System.out.println("\n SAME STRINGS "); 
            } 
            else
            {
               System.out.println("\n NOT SAME STRINGS "); 
            } 
        }
    }


