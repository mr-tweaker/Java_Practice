/*
PriorityQueue
The PriorityQueue class implements the Queue interface. 
It holds the elements or objects which are to be processed by their priorities. 
PriorityQueue doesn't allow null values to be stored in the queue.
*/

	import java.util.*;
  
public class PriorityQueueDemo
{  
	public static void main(String args[])
	{  
		PriorityQueue<String> queue=new PriorityQueue<String>();  

			queue.add("April");  
			queue.add("May");  
			queue.add("June");  
			queue.add("July");
		       //queue.add(null);
 
		System.out.println("head:"+queue.element());  	
		System.out.println("head:"+queue.peek());  

		System.out.println("iterating the queue elements:");  

		Iterator obj=queue.iterator();  

		while(obj.hasNext())
		{  
 		    System.out.println(obj.next());  
		}  

			queue.remove();  
			queue.poll();  
 
  	System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  

		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());  
		}  
	}  
}  