/*
      Method with variable arguments
*/     

      class Abc
      {
          public void show(int ... x)
          {
              System.out.println("\n List : ");
              for(int i=0 ; i<x.length ; i++)
              {
                 System.out.print("  "+x[i]);
              }
          }
      }

    public class CO4
    {
        public static void main(String [] args)
        {
             Abc obj = new Abc();
  
              obj.show(10,20);
              obj.show(11, 22, 33);
              obj.show();
              obj.show(1,2,3,4,5);
        }
    }
