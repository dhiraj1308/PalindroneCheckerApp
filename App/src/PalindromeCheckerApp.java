/**
 * ************************************************************
 * MAIN CLASS - UseCase9RecursivePalindrome
 * ************************************************************
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion, ignoring 
 * case, spaces, and special characters.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All valid characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author KANDURU-SUDHEER
 * @version 9.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Testing with complex phrases
        String test1 = "Madam, I'm Adam";
        String test2 = "A man, a plan, a canal: Panama";
        String test3 = "Hello World";

        System.out.println("Is '" + test1 + "' a palindrome? " + check(test1, 0, test1.length() - 1));
        System.out.println("Is '" + test2 + "' a palindrome? " + check(test2, 0, test2.length() - 1));
        System.out.println("Is '" + test3 + "' a palindrome? " + check(test3, 0, test3.length() - 1));
    }

    /**
     * Recursively checks whether a string is a palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case: If the pointers meet or cross, we've checked everything
        if (start >= end) {
            return true;
        }

        // Logic to skip non-alphanumeric characters (spaces, commas, etc.)
        if (!Character.isLetterOrDigit(s.charAt(start))) {
            return check(s, start + 1, end);
        }
        if (!Character.isLetterOrDigit(s.charAt(end))) {
            return check(s, start, end - 1);
        }

        // Compare characters case-insensitively
        char charStart = Character.toLowerCase(s.charAt(start));
        char charEnd = Character.toLowerCase(s.charAt(end));

        if (charStart != charEnd) {
            return false;
        }

        // Recursive Step: Move the pointers inward
        return check(s, start + 1, end - 1);
    }
}