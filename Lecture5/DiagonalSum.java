/*
           Diagonal Sum

              A                               
              j   
           0  1  2                 
         0 1  2  3                
      i  1 4  5  6          
         2 7  8  9           

          fd         bd
          00         02 
          11         11
          22         20 
*/

      import java.util.*;
   
    public class DiagonalSum
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
              int i,j, fd=0, bd=0;
 
          System.out.println("\n Enter 9 nums : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     A[i][j] = s.nextInt();
                 }     
              }

              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     if(i==j)
                     {
                        fd = fd + A[i][j]; 
                     }
                     if(i+j == 2)
                     {
                        bd = bd + A[i][j];
                     }
                 }     
              }

          System.out.println("\n sum of for diagonal = "+fd);
          System.out.println("\n sum of back diagonal = "+bd);
        }
    }

