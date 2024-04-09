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

    public class WrapperDemo2
    {
        public static void main(String [] args)
        {
                float x=2.5f;

             Float obj = new Float(x);
               
             System.out.println("\n obj = "+obj);        

                float y = obj.floatValue();

             System.out.println("\n y = "+y);
        }
    }


