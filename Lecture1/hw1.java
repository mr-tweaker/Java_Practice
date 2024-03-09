import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = sc.next().charAt(0);

        switch(input){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(input + " is a vowel.");
                break;
            default:
                System.out.println(input + " is not a vowel.");
                break;
        }
        sc.close();
    }
}
