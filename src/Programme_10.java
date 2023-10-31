import java.util.Scanner;

public class Programme_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber, remainder, result = 0;
        int n = 0;
        originalNumber = num;

        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }
        originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        return result == num;


    }
}

