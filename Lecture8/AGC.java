/*
       Automatic Garbage Collector 
*/     
 
     class Abc
     {
           int a, b;

         public Abc()
         {
             a = 10;
             b = 20; 
         }   

         public Abc(int x, int y)
         {
             a = x;
             b = y; 
         }   

         public void show()
         {
             System.out.println("\n a = "+a);
             System.out.println("\n b = "+b);
         }

         public void finalize()
         {
             System.out.println("\n finalize() is called...");
         }   
     }

    public class AGC
    {
        public static void main(String [] args)
        {
               Abc A = new Abc();
                  A.show();

               Abc B = new Abc(11, 22);
                  B.show();

               Abc C = new Abc(100, 200);
                  C.show();

                  A = null;
                  B = null;
                  C = null;
 
                  System.gc();
        }
    }
