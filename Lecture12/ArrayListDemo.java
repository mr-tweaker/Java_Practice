/*
   ArrayList

The ArrayList class implements the List interface. 
It uses a dynamic array to store the duplicate element of different data types. 
The ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList class can be randomly accessed.
*/

     import java.util.*;
  
public class ArrayListDemo
{  
	public static void main(String args[])
	{  
          ArrayList<String> list=new ArrayList<String>();

		list.add("APRIL");  
		list.add("MAY");  
		list.add("JUNE");  
		list.add("JULY");    
                list.add("JUNE");  
		list.add("JULY");    
              
   	       Iterator obj = list.iterator();  

		while(obj.hasNext())
		{  
         	   System.out.println(obj.next());  
		}  
	}  
}  
