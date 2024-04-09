/*
ArrayDeque (FIFO)

ArrayDeque class implements the Deque interface. 
It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.

ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
*/

	import java.util.*;
  
public class DequeDemo
{  
	public static void main(String[] args) 
	{  
		Deque<String> deque = new ArrayDeque<String>();  

			deque.add("April");  
			deque.add("May");  
			deque.add("June");  

                        deque.pop();

		for(String str : deque) 
		{  
		   System.out.println(str);  
		}  
	}  
}  
