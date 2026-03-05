/**
 * =============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @aArunSriramGudla
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "level";

        // We will use the StackStrategy for this performance test
        PalindromeStrategy strategy = new StackStrategy();

        // 1. Capture Start Time
        long startTime = System.nanoTime();

        // 2. Execute the Algorithm
        boolean isPalindrome = strategy.isValid(input);

        // 3. Capture End Time
        long endTime = System.nanoTime();

        // 4. Calculate Duration
        long duration = endTime - startTime;

        // 5. Display Results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * Strategy Interface (Reused from UC12)
 */
interface PalindromeStrategy {
    boolean isValid(String text);
}

/**
 * Stack Implementation for Performance Comparison
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String text) {
        // Simple validation logic
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.equals(reversed.toString());
    }
}
