/*
      String Palindrome

               i   j  
        str = "madam"  
*/

        import java.util.*;
   
    public class StringPalindrome
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
              int i,j,len;
              boolean flag=true;

           System.out.println("\n Enter a string : ");
              String str = s.nextLine();
          
             len = str.length();

           for(i=0,j=len-1 ; i<len/2 ; i++,j--)
           {
               if(str.charAt(i) != str.charAt(j))
               {
                   flag = false;
                    break;  
               }
           }   

           if(flag)
           { 
                System.out.println("\n Palindrome ");
           } 
           else
           { 
                System.out.println("\n Not Palindrome ");
           } 
           s.close();
        }
    }
