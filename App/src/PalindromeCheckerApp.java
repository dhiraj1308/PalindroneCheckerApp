import java.util.LinkedList;
import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * MAIN CLASS - UseCaseBPalindromeCheckerApp
 * ---------------------------------------------------------
 *
 * Use Case B: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @dhiraj Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the list
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                list.add(ch);
            }
        }

        boolean isPalindrome = true;

        // Symmetric validation using removeFirst() and removeLast()
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
