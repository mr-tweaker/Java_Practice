/*
       Abstract Classes in Java
 
  1] They are declared using keyword abstract.
  2] Abstract classes can not be instantiated.
     (Objects can not be created)
  3] It can contain constructors, abstract methods & non-abstract methods. 
  4] They are mostly super-classes.

       Abstract Methods in Java
 
  1] They are declared using keyword abstract.
  2] It must be declared inside abstract class only.
  3] They do not have implementation code.
  4] Its declaration ends with semicolon(;)
  5] It must be overridden in non-abstract sub-classes. 

*/

      abstract class Abc
      {
          public Abc()
          {
          }
 
           public abstract void add(int a, int b);
      }

      class Xyz extends Abc
      {
          public void add(int a, int b)
          {
          }
      } 

    public class AbstractDemo
    {
        public static void main(String [] args)
        {
            Abc obj;
        }
    }


