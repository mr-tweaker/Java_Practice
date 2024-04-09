/*
 Wrapping - Conversion of primitive type into an object type 
 Unwrapping - Conversion of object type back to the primitive type. 
-----------------------------------------------------------------------------      
                           java.lang
     DATA TYPE           WRAPPER CLASS
       char                Character
       byte                Byte
       short               Short
       int                 Integer
       long                Long
       float               Float
       double              Double
       boolean             Boolean
*/    

    public class WrapperDemo1
    {
        public static void main(String [] args)
        {
                int x=100;

             Integer obj = new Integer(x);
               
             System.out.println("\n obj = "+obj);        

                int y = obj.intValue();

             System.out.println("\n y = "+y);
        }
    }


