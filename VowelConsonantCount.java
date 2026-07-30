
import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int vowel = 0;
        int consonant = 0;

        String lowerInput = userInput.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel_Count++;
                } else {
                    consonan_Count++;
                }
            }
        }

        System.out.println("Vowels:" + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }
}
