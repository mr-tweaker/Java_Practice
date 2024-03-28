/*
         Static variables in Java

 1] They are declared using keyword static. 
 2] Its default value is zero.
 3] Compiler creates only one copy of static variable for class.
    No separate copy for every object.
 4] They are class members not object members.

         Static Methods in Java

 1] They are declared using keyword static. 
 2] It can access only other static members of class.
 3] It can be called using class-name directly.
 4] They are class members not object members.
*/     

     class Abc
     {
         int x;
         static int count;

         public Abc(int a)
         {
             x = a;
             count++; 
         }  

         public void show()
         {
             System.out.println("\n x = "+x);
             System.out.println(" count = "+count);
         }  

         public static void display()
         {
             System.out.println(" count = "+count);
         }  
     }

/*
         A        B        C
       x=10      x=20    x=30

              count=3
*/

    public class StaticDemo
    {
        public static void main(String [] args)
        {
             Abc A = new Abc(10);
                 A.show();

             Abc B = new Abc(20);
                 B.show();

             Abc C = new Abc(30);
                 C.show();

          System.out.println("\n--------------------");
               Abc.display();
        }
    }
