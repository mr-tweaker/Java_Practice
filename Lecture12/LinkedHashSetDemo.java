/*
LinkedHashSet

LinkedHashSet class represents the LinkedList implementation of Set Interface. 
It extends the HashSet class and implements Set interface. 
Like HashSet, It also contains unique elements. 
It maintains the insertion order and permits null elements.
*/

	import java.util.*;
  
public class LinkedHashSetDemo
{  
	public static void main(String args[])
	{  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  

			set.add("April");  
			set.add("May");  
			set.add("April");  
			set.add("May"); 
 
  		    Iterator<String> itr=set.iterator();  
			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
			}	  
	}  
}  
