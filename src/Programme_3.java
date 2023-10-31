import java.util.Scanner;

public class Programme_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String input = scan.next();
        if (input.length() == 1) {
            char character = input.charAt(0);
            if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                boolean isVowel = "AEIOUaeiou".contains(String.valueOf(character));
                if (isVowel) {
                    System.out.println(character + " is a Vowel.");
                } else {
                    System.out.println(character + " is a Consonant.");
                }
            } else {
                System.out.println("Error:Not a letter");
            }
        } else {
            System.out.println("Error: Input Should be single Character only");
        }
        scan.close();
    }
}
