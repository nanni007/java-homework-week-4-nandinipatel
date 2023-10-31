import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int numRows = scan.nextInt();
        for (int i = 1; i <= numRows; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
        scan.close();
    }
}

