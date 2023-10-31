import java.util.Scanner;

public class Programme_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(sumDigital(125));
        System.out.println(sumDigital(1));
        System.out.println(sumDigital(-12));
        System.out.println(sumDigital(0));
    }
    public static int sumDigital(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
