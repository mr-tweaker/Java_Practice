import java.util.*;

public class secondLargestHW {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i, size;

        System.out.println("\n Enter size: ");
        size = s.nextInt();

        int [] x = new int[size];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter nums: ");
            for(i=0; i<size; i++){
                x[i] = s.nextInt();
                int num = x[i];
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest){
                secondLargest = num;
                }
            }
            System.out.println("Largest Element: " +largest);
            System.out.println("Second largest element: " +secondLargest);
            s.close();
    }
}
