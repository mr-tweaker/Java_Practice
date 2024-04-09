/*
       "Exception Handling in JAVA"
---------------------------------------------------------------------
  Types of Errors

 1] Compile Time Error
         example:
               semicolon missing

 2]] Logical Error
         example:
                 if(num % 3 == 0)
                      S.o.p("EVEN")

 3] Run-Time Error
        example:
                Divide By Zero
                Array Index Out of bounds
---------------------------------------------------------------------
    try
    catch
    finally
    throw
    throws
----------------------------------------------------------------------
   java.lang.Exception
         ArithmeticException
         ArrayIndexOutOfBoundsException
         StringIndexOutOfBoundsException
*/
 
    public class ExceptionDemo1
    {
        public static void main(String [] args)
        {
             int a=10, b=2, ans=0;

             try
             {
                 ans = a/b;
             }  
             catch(Exception e)
             {
                 System.out.println(e); 
             }
             finally
             {
                 System.out.println("\n ans = "+ans); 
             }
        }
    }
