/*
    Q] WAP to convert a string into title case

         str = "i love java"

         str = "I Love Java"
*/     

       import java.util.*;
 
    public class TitleCase
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
               int i;

          System.out.println("\n Enter a string : ");
        StringBuffer str = new StringBuffer(s.nextLine());

          str.setCharAt(0, Character.toUpperCase(str.charAt(0)));

           for(i=0 ; i<str.length() ; i++)
           {
               if(str.charAt(i) == ' ')
               {
          str.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));                   
               }
           } 

          System.out.println("\n String after title case = "+str);
        }
    }
