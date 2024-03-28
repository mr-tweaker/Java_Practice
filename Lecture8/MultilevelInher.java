      
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
             System.out.println("\n CONS CLASS B "); 
         } 
     } 

     class C extends B
     {
         public C()
         {
             System.out.println("\n CONS CLASS C "); 
         } 
     } 

    public class MultilevelInher
    {
        public static void main(String [] args)
        {
            C obj = new C(); 
        }
    }


