import java.util.Scanner;

public class Programme_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count < 10) {
            System.out.println("Enter a number: " + (count + 1) + ": ");
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scan.nextLine(); //Consume the newline character
        }
        System.out.println("Sum of the 10 valid numbers: " + sum);
        //Close scanner
        scan.close();
    }


}
