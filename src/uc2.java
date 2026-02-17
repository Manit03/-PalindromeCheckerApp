// UseCase2PalindromeCheckerApp.java
public class uc2 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if the original string is equal to the reversed string
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
