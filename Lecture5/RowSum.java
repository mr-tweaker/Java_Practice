/*
   HOMEWORK
 Q1] RowMax
 Q2] RowSwap
 Q3] ColumnSwap
 Q4] SymmetricMatrix

           Row Sum

              A  
           0  1  2                 
         0 1  2  3 => 6                 
         1 4  5  6 => 15        
         2 7  8  9 => 24

*/
      import java.util.*;
   
    public class RowSum
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);
             int [][] A = new int[3][3];
                int i, j, sum=0;
 
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
                     sum=0;

                 for(j=0 ; j<3; j++)
                 {
                    sum = sum + A[i][j];  
                 }     

                 System.out.println("\n sum = "+sum);
              }
        }
    }

