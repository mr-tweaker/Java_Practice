      
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

     class C extends A
     {
         public C()
         {
             System.out.println("\n CONS CLASS C "); 
         } 
     } 

    public class HierarchicalInher
    {
        public static void main(String [] args)
        {
            B obj1 = new B();
            C obj2 = new C();
        }
    }


