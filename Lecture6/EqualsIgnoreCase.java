/*
      ASCII - American Standard Code For Information Interchange

           A = 65      a = 97
           B = 66      b = 98
           C = 67      c = 99
*/   

    public class EqualsIgnoreCase
    {
        public static void main(String [] args)
        {
             String s1 = "Computer";
             String s2 = "computer";
 
            if(s1.equalsIgnoreCase(s2))
            {
               System.out.println("\n EQUAL "); 
            } 
            else
            {
               System.out.println("\n NOT EQUAL "); 
            } 
        }
    }
