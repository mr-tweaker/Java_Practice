import java.util.*;

public class deletionArrayHW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, size, numDelete, dIndex;

        System.out.print("\n Enter size: ");
        size = s.nextInt();

        int [] x = new int[size];

        System.out.print("\n Enter nums: ");
        for(i=0; i<size; i++){
            x[i] = s.nextInt();
        }

        System.out.println("Enter the number to delete: ");
        numDelete = s.nextInt();

        dIndex = -1;

        for(i=0; i<size; i++){
            if(x[i] == numDelete){
                dIndex = i;
                break;
            }
        }

        if(dIndex != -1){
            for(i = dIndex; i<size-1; i++){
                x[i] = x[i+1];
            }
            size--;

            System.out.println("Number deleted successfully");
            System.out.println("Resulting array after deletion: ");
            
            for(i=0; i<size; i++){
                System.out.print(x[i] + " ");
            }
        } else {
            System.out.println("Number not found in the array.");
        }
        s.close();
    }
}
