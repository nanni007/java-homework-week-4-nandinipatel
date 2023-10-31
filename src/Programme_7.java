import java.util.Scanner;

public class Programme_7 {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }
        if (number < 10){
            return 2 * number;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number>0){
            firstDigit=number%10;
            number/=10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(scan.hasNextInt()) {
            int number = scan.nextInt();
            int result = sumFirstAndLastDigit(number);
            System.out.println("Result is: " + result);
        }else{
            System.out.println("Invalid Input, enter Integer value.");
        }
    scan.close();
    }
}
