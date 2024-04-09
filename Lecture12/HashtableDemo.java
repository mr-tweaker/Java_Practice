/*
Java Hashtable class
Java Hashtable class implements a hashtable, which maps keys to values. 
It inherits Dictionary class and implements the Map interface.

Points to remember
A Hashtable is an array of a list. 
Each list is known as a bucket. 
The position of the bucket is identified by calling the hashcode() method. 
A Hashtable contains values based on the key.
Java Hashtable class contains unique elements.
Java Hashtable class doesn't allow null key or value.
Java Hashtable class is synchronized.
*/

	import java.util.*;
  
class HashtableDemo
{  
	 public static void main(String args[])
	 {  
 		 Hashtable<String,Integer> hm=new Hashtable<String, Integer>();  
  
	  		hm.put("Jan", 31);  
	 	 	hm.put("Feb", 28);  
	  		hm.put("March", 31);  
	  		hm.put("April", 30);  
  
  	 	for(Map.Entry m:hm.entrySet())
		{  
 	 	    System.out.println(m.getKey()+" "+m.getValue());  
    	        }  
   }  
}  

