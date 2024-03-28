/*
       "Constructor in JAVA"

 1] It is a special function with same name as class-name.
 2] It has no return type. Not even void.
 3] When we create an object of class constructor gets called automatically.
 4] It allocates memory for an object.
 5] It is used to initialize data members in class.
------------------------------------------------------------------------------
 NOTE:   
 If there is no constructor present in class then java compiler will provide one default constructor.
 
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
     }

    public class Constructor
    {
        public static void main(String [] args)
        {
               Abc A = new Abc();
                  A.show();

               Abc B = new Abc(11, 22);
                  B.show();

               Abc C = new Abc(100, 200);
                  C.show();
        }
    }


