/*
TreeSet
Java TreeSet class implements the Set interface that uses a tree for storage. 
Like HashSet, TreeSet also contains unique elements. 
However, the access and retrieval time of TreeSet is quite fast. 
The elements in TreeSet stored in ascending order.
It does not allow null value.
*/

	import java.util.*;  

public class TreeSetDemo
{  
	public static void main(String args[])
	{  
		TreeSet<String> set=new TreeSet<String>();  

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
