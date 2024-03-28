import java.util.*;

public class ColumnSwapHW {
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
        System.out.println("\n Enter the column numbers to swap: ");
        int col1 = s.nextInt();
        int col2 = s.nextInt();

        for(i=0; i<3; i++)
        {
            int temp = A[i][col1 - 1];
            A[i][col1 - 1] = A[i][col2 - 1];
            A[i][col2 - 1] = temp;
        }

        System.out.println("\n Matrix after swapping columns: ");
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
