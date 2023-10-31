import java.util.Scanner;

public class Programme_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        scan.close();

        int evenSum = getEvenDigitSum(number);

        if (evenSum == -1) {
            System.out.println("Invalid value entered(negative no.) ");

        } else {
            System.out.println("Sum of even digits: " + evenSum);
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }


}