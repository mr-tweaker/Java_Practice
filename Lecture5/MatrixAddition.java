/*
       int [][] x = new int[3][3];

               Matrix Addition

              A                 B              C
           0  1  2           0  1  2       0   1   2
         0 1  2  3         0 9  8  7     0 10  10
       i 1 4  5  6         1 6  5  4     1
         2 7  8  9         2 3  2  1     2
              j
*/


      import java.util.*;
   
    public class MatrixAddition
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
             int [][] B = new int[3][3];
             int [][] C = new int[3][3];
                 int i,j;
 
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

          System.out.println("\n Matrix after addition : ");
              for(i=0 ; i<3 ; i++)
              {
                 for(j=0 ; j<3; j++)
                 {
                     C[i][j] = A[i][j] + B[i][j];

                     System.out.print(" "+C[i][j]);                     
                 }     
                     System.out.print("\n");
              }
        }
    }

