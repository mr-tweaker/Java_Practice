/*
HashMap

Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
*/ 

 import java.util.*;  

public class HashMapDemo
{  
   public static void main(String args[])
   {
   //Creating HashMap      
   HashMap<Integer,String> map=new HashMap<Integer,String>();

     map.put(1,"Mango");  //Put elements in Map  
     map.put(2,"Apple");    
     map.put(3,"Banana");   
     map.put(4,"Grapes");
     map.put(null,null);
   
   System.out.println("Iterating Hashmap...\n");  
   for(Map.Entry m : map.entrySet())
   {    
      System.out.println(m.getKey()+" "+m.getValue());    
   }  

 }  
}  