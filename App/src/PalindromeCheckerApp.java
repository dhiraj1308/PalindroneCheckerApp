/**
 * *************************************************************
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * *************************************************************
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @dhiraj Developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        // Example usage
        String testWord = "racecar";
        boolean result = service.checkPalindrome(testWord);

        System.out.println("Is '" + testWord + "' a palindrome? " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Remove whitespace and convert to lowercase for accurate checking
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();

        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}