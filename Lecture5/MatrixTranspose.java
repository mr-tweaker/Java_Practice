/*
               Matrix Transpose

              A                 B              
           0  1  2           0  1  2      
         0 1  2  3         0 1  4  7       
         1 4  5  6         1 2  5  8 
         2 7  8  9         2 3  6  9  
*/

      import java.util.*;
   
    public class MatrixTranspose
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
             int [][] B = new int[3][3];
                 int i,j;
 
          System.out.println("\n Enter 9 nums : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     A[i][j] = s.nextInt();
                 }     
              }

          System.out.println("\n Matrix after transpose : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                       B[i][j] = A[j][i];

                     System.out.print(" "+B[i][j]);                     
                 }     
                     System.out.print("\n");
              }
        }
    }

