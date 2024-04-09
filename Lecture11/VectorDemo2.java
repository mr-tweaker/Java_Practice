    
       import java.util.*;
 
      class Employee
      {
          String ename;
          int eid;

          public Employee(String ename, int eid)
          {
              this.ename = ename;
              this.eid = eid;
          } 

         public boolean equals(Object o)
         {
             if(o instanceof Employee)
             {
                Employee obj = (Employee)o;
              
                if(eid == obj.eid)
                {
                    return true;
                }
                else
                {
                    return false;
                }
             }   
             else
             {
                  return false;
             }
         }
      }

    public class VectorDemo2
    {
        public static void main(String [] args)
        {
            String s1 = new String("JAVA");
            String s2 = new String("JAVA");
 
          Employee e1 = new Employee("ABC", 101);
          Employee e2 = new Employee("ABC", 101);

             Vector v = new Vector();
 
                  v.add(e1);
   
            if(v.contains(e2))
            {
               System.out.println("\n TRUE ");  
            }
            else
            {
               System.out.println("\n FALSE ");  
            }
        }
    }


