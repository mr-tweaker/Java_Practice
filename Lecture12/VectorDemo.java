/*
Vector
Vector uses a dynamic array to store the data elements. 
It is similar to ArrayList. 
However, It is synchronized and contains many methods that are not the part of Collection framework.
*/

	import java.util.*;
  
public class VectorDemo
{  
   public static void main(String args[])
   {  
         Vector<String> v=new Vector<String>();
  
		v.add("APRIL");  
		v.add("MAY");  
		v.add("JUNE");  
		v.add("JULY");  
                v.addElement("AUGUST"); 
         
               if(v.contains("AUGUST"))
               {
                   System.out.println(" TRUE ");
               }
               else
               {
                   System.out.println(" FALSE ");
               }      

                v.removeElementAt(0);
                v.insertElementAt("ABHISH", 0);
                v.remove("JUNE");
       
                for(int i=0 ; i<v.size() ; i++)
                {
                    System.out.println(v.elementAt(i));
                }

   	     Iterator<String> itr=v.iterator();
  
		//while(itr.hasNext())
                {  
		   // System.out.println(itr.next());  
                }  
	}  
}  