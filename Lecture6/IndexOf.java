/*
      ASCII - American Standard Code For Information Interchange

           A = 65      a = 97
           B = 66      b = 98
           C = 67      c = 99
*/   

    public class IndexOf
    {
        public static void main(String [] args)
        {
             String s1 = "CompCuterC";
             
             int i = s1.indexOf("Comp", 3);

             System.out.println("\n i = "+i);  
        }
    }

/*
          int i = s1.indexOf(char);
          int i = s1.indexOf(char, int);
          int i = s1.indexOf(String);
          int i = s1.indexOf(String , int);

  NOTE: 
  indexOf() returns -1 if given char or String is not present
*/
