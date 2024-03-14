import java.util.*;

public class dec2binHW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal, binary=0, remainder, product = 1;

        System.out.print("Enter a decimal: ");
        decimal = s.nextInt();

        while(decimal != 0){
            remainder = decimal % 2;
            binary = binary + (remainder * product);
            decimal = decimal / 2;
            product = product * 10;
        }
        System.out.println("\n The number in binary is: "+binary);
        s.close();
    }
}
