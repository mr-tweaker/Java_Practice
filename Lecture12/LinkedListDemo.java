/*
LinkedList

LinkedList implements the Collection interface. 
It uses a doubly linked list internally to store the elements. 
It can store the duplicate elements. 
It maintains the insertion order and is not synchronized. 
In LinkedList, the manipulation is fast because no shifting is required.
*/

	import java.util.*;
  
public class LinkedListDemo
{  
   public static void main(String args[])
   {  
	LinkedList<String> list = new LinkedList<String>();  

		list.add("APRIL");  
		list.add("MAY");  
		list.add("JUNE");  
		list.add("JULY");  
 
                System.out.println(list);

                 list.remove("MAY");

	   Iterator<String> itr = list.iterator();  

		while(itr.hasNext())
		{  
		   System.out.println(itr.next());  
		}  
	}  
}  
