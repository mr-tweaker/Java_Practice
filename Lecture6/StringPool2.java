
    public class StringPool2
    {
        public static void main(String [] args)
        {
                String s1 = "JAVA";
                String s2 = "JAVA";
 
              String s3 = new String("JAVA");
              String s4 = new String("JAVA");
 
             if(s3 == s4)
             {
                System.out.println("\n SAME ");
             }
             else
             {
                System.out.println("\n NOT SAME ");
             }
        }
    }


