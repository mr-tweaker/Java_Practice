/*
      Array - It is a collection of elements of same data type.
 
             int [] x = new int[5];
                    OR
             int x [] = new int[5]; 
*/

    public class Array1
    {
        public static void main(String args[])
        {
            int [] x = {10,20,30,40,50};

            System.out.println("\n List : "); 
            for(int i=0 ; i<x.length ; i++)
            {
                System.out.println(x[i]);
            } 

            System.out.println("\n List : "); 
               for(int a : x)
               {
                   System.out.println(a); 
               }
        }
    }





