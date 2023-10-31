import java.util.Scanner;

public class Programme_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms in the sequence: ");
        int n = scan.nextInt();
        int a = 1;
        int b = 1;
        int c;

        System.out.println("Fibonacci Sequence: ");
        System.out.println(a + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
        scan.close();
    }

}
