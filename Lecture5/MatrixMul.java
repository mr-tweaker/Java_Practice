/*
                 Matrix Multiplication

              A                 B              
           0  1  2           0  1  2      
         0 1  2  3         0 9  8  7     
         1 4  5  6         1 6  5  4     
         2 7  8  9         2 3  2  1     

                       C
               0       1        2 
          0  9+12+9  -----    ----- 9times
          1  ------  -----    -----
          2  ------  -----    ----- 27 times 
*/

      import java.util.*;
   
    public class MatrixMul
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
             int [][] B = new int[3][3];
             int [][] C = new int[3][3];
                 int i,j,k;
 
          System.out.println("\n Enter 9 nums : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     A[i][j] = s.nextInt();
                 }     
              }

          System.out.println("\n Enter 9 nums : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     B[i][j] = s.nextInt();
                 }     
              }

             for(i=0 ; i<3 ; i++)
             {
                 for(j=0 ; j<3; j++)
                 {                     
                     for(k=0 ; k<3 ; k++)
                     {
                         C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                     }     
                 }
             }

          System.out.println("\n Matrix after mul : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     System.out.print(" "+C[i][j]);                     
                 }     
                     System.out.print("\n");
              }
        }
    }
