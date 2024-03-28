/*
     HOMEWORK

  Q1] Count no of vowels in a given string
        example:
           str = "Delhi"
           count = 2
 
  Q2] WAP to sort a string in ascending order
 
          str = "monday"
          str = "admnoy"
*/

    public class StringBufferDemo
    {
        public static void main(String [] args)
        {
            StringBuffer str = new StringBuffer("Computer"); 

              str.append("Programming");
              str.insert(0, "Java");
              str.setCharAt(0, 'j');
              str.reverse();   
 
            System.out.println("\n str = "+str);
        }
    }
