/**
 * =============================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =============================================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @dhiraj Developer
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // Data Structures
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // 1. Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // 2. Compare by removing from the front of the queue and top of the stack
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Result Output
        if (isPalindrome) {
            System.out.println("The input string is confirmed as a palindrome.");
        } else {
            System.out.println("The input string is NOT a palindrome.");
        }

        scanner.close();
    }
}

