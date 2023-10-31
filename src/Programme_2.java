import java.util.Scanner;

public class Programme_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number: ");
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                if (number < min) {
                }
                min = number;
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid input.");
                break;
            }
            scan.nextLine();
            if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
                System.out.println("Minimum number entered is: " + min);
                System.out.println("Maximum number entered is: " + max);
            } else {
                System.out.println("NUMBER NOT VALID");
            }
            scan.close();
        }
    }
}
