import java.util.*;

public class RowMaxHW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] A = new int[3][3];
        int i, j;

        System.out.println("\n Enter 9 nums: ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                A[i][j] = s.nextInt();
            }
        }

        for(i=0; i<A.length; i++)
        {
            int max = A[i][0];
            for(j=1; j<A[i].length; j++)
            {
                if(A[i][j] > max)
                {
                    max = A[i][j];
                }
            }
            System.out.println("Max element in a row: "+max);
        }
    }
}
