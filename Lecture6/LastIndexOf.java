
    public class LastIndexOf
    {
        public static void main(String [] args)
        {
             String s1 = "CompCuterC";
             
             int i = s1.lastIndexOf('D');

             System.out.println("\n i = "+i);  
        }
    }

/*
          int i = s1.lastIndexOf(char);
          int i = s1.lastIndexOf(char, int);
          int i = s1.lastIndexOf(String);
          int i = s1.lastIndexOf(String , int);

  NOTE: 
  lastIndexOf() returns -1 if given char or String is not present
*/
