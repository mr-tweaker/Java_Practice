    
       import java.util.*;
 
    public class VectorDemo
    {
        public static void main(String [] args)
        {
             Vector v = new Vector();

                 v.add("MAY");
                 v.addElement("JUNE");
                 v.addElement("JULY");
                 v.addElement(new Integer(100));
                 v.add(new Float(2.5f));
 
                  v.remove("JULY");
                  v.removeElementAt(0);
                  v.insertElementAt("APRIL", 0);  

                 System.out.println(v);
             
              System.out.println("\n---------------------");
              for(int i=0 ; i<v.size(); i++)
              {
                 System.out.println(v.elementAt(i)); 
              }

              System.out.println("\n---------------------");
              for(Object o : v)
              {
                 System.out.println(o); 
              }    
        }
    }

