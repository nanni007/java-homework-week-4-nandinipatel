import java.util.Scanner;

public class Programme_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number( should be between 10 and 99: ");
        int x = scan.nextInt();
        System.out.println("Enter the second number( should be between 10 and 99: ");
        int y = scan.nextInt();
        boolean result = hasSharedDigit(x, y);
        System.out.println("Result: " + result);
        scan.close();
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int value1a = x % 10;
        int value1b = x / 10;
        int value2a = y % 10;
        int value2b = y / 10;
        return (value1a == value2a || value1a == value2b || value1b == value2a || value1b == value2b);
    }
}
