/*
    Method Overloading 
    Methods having same name but different parameters within same class.

     It is also called as Compile Time Polymorphism.
*/     

     class Abc
     {
         public void add(int a, int b)
         {
            System.out.println("\n Add = "+(a+b)); 
         }

         public void add(float a, float b)
         {
            System.out.println("\n Add = "+(a+b)); 
         }

         public void add(int a, int b, int c)
         {
            System.out.println("\n Add = "+(a+b+c)); 
         }
     }

    public class CO3
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();

               obj.add(10,20);
               obj.add(10.11f, 20.22F);
               obj.add(11,22,33);
        }
    }
