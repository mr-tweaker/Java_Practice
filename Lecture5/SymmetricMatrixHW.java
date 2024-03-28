import java.util.*;

public class SymmetricMatrixHW {
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
        boolean isSymmetric = true;
        
        for(i=0; i<A.length; i++)
        {
            for(j=0; j<A.length; j++)
            {
                if(A[i][j] != A[j][i])
                {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric)
            {
                break;
            }
        }
        if(isSymmetric)
        {
            System.out.println("Symmetric Matrix");
        }
        else
        {
            System.out.println("Not Symmetric Matrix");
        }
    }
}
