/*
Stack (LIFO)

The stack is the subclass of Vector. 
It implements the last-in-first-out data structure, i.e., Stack. 
The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean pop(), which defines its properties.
*/

	import java.util.*;
  
public class StackDemo
{  
	public static void main(String args[])
	{  
		Stack<String> stack = new Stack<String>();  

	            stack.push("April");  
		    stack.push("May");  
		    stack.push("June");  
		    stack.push("July");  
	  
    		     stack.pop();  

		Iterator<String> itr=stack.iterator();  

		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}  
