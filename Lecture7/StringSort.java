/*
     Q] WAP to sort a string in asc order
          example : 
               str = "monday"
               str = "admnoy"

         0 m <-i=0
         1 o <-j=i+1
         2 n
         3 d
         4 a  
         5 y
         
*/     

       import java.util.*;
 
    public class StringSort
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
               int i, j;
               char temp;

          System.out.println("\n Enter a string : ");
        StringBuffer str = new StringBuffer(s.nextLine());

           for(i=0 ; i<str.length() ; i++)
           {
               for(j=i+1 ; j<str.length() ; j++)
               {
                   if(str.charAt(i) > str.charAt(j))
                   {
                       temp = str.charAt(i);
                       str.setCharAt(i, str.charAt(j));
                       str.setCharAt(j, temp);
                   }
               }    
           }

          System.out.println("\n String after sort : "+str); 
        }
    }
