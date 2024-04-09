/*
HashSet

HashSet class implements Set Interface. 
It represents the collection that uses a hash table for storage. 
Hashing is used to store the elements in the HashSet. 
It contains unique items.
It keeps elements in sorted order.
It allows max one null value
*/

	import java.util.*;
  
public class HashSetDemo
{  
	public static void main(String args[])
	{  
		HashSet<String> set=new HashSet<String>();  

			set.add("April");  
			set.add("May");  
			set.add("June");  
			set.add("July");  
                        set.add("April");  
			set.add("May");  
			set.add("June");  
			set.add("July");  
                        set.add("August");  
                        set.add(null);  
                        set.add(null);  

		Iterator<String> itr=set.iterator();  

			while(itr.hasNext())
			{  
			    System.out.println(itr.next());  
			}  
	}  
}  
