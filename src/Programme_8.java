import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = scan.nextInt();
        for (int i = 1; i <= rows; ++i) {
            for (int n = 1; n <= i; ++n) {
                System.out.print("@");
            }
            System.out.println();
        }
        scan.close();
    }
}
