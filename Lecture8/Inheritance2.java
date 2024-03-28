     
      class A  
      {
          public A()
          {
             System.out.println("\n CONS CLASS A ");  
          }
      }

      class B extends A 
      {
          public B()
          {
                  super();  
             System.out.println("\n CONS CLASS B ");
          }
      }

    public class Inheritance2
    {
        public static void main(String [] args)
        {
            B obj = new B();
        }
    }
