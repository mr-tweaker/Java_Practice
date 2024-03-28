import java.util.*;

public class RowSwapHW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] A = new int[3][3];
        int i, j;

        System.out.println("Enter 9 nums: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                A[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n Enter the row numbers to swap: ");
        int row1 = s.nextInt();
        int row2 = s.nextInt();

        int[] tempRow = A[row1 - 1];
        A[row1 - 1] = A[row2 - 1];
        A[row2 - 1] = tempRow;

        System.out.println("\n Matrix after swapping rows: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
