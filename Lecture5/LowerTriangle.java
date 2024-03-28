/*
               Lower Triangle

              A                               
              j   
           0  1  2                 
         0 1  2  3                
      i  1 4  5  6          
         2 7  8  9           

          Lower Tri  (i>=j)      Upper Triangle (i<=j) 

          1                        1  2  3
          4 5                      _  5  6
          7 8 9                    _  _  9  
*/

      import java.util.*;
   
    public class LowerTriangle
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
                 int i,j;
 
          System.out.println("\n Enter 9 nums : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     A[i][j] = s.nextInt();
                 }     
              }

          System.out.println("\n Lower Triangle : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     if(i>=j)
                      System.out.print(" "+A[i][j]);                     
                 }     
                     System.out.print("\n");
              }

          System.out.println("\n Upper Triangle : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     if(i<=j)
                      System.out.print(" "+A[i][j]);
                     else
                       System.out.print("  ");                     
                 }     
                     System.out.print("\n");
              }
        }
    }

