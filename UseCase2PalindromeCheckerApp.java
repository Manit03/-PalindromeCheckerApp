/**
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Check
 *
 * Description:
 * This class checks whether a predefined
 * string is a palindrome.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0\n");

        String word = "madam"; // Hardcoded input
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}