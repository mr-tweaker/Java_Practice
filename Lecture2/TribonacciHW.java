import java.util.*;

public class TribonacciHW {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0, b=1, c=1, n;

        System.out.print("\n Enter n: ");
        n = s.nextInt();

        System.out.println("Tribonacci Series: ");
        int i = 3;
        while(i<n){
            int next = a+b+c;
            System.out.print(next + " ");
            a = b;
            b = c;
            c = next;
            i++;
        }
        s.close();
    }
}
