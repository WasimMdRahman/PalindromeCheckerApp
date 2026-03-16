public class Main {
    public static void main(String[] args) {

        class PalindromeChecker {

            // Method to check palindrome
            public boolean checkPalindrome(String text) {

                String reversed = "";

                // Reverse the string
                for (int i = text.length() - 1; i >= 0; i--) {
                    reversed = reversed + text.charAt(i);
                }

                // Compare strings
                return text.equals(reversed);
            }
        }

        public class PalindromeApp {

            public static void main(String[] args) {

                String word = "madam";

                // Create object of PalindromeChecker
                PalindromeChecker checker = new PalindromeChecker();

                // Call method
                if (checker.checkPalindrome(word)) {
                    System.out.println(word + " is a Palindrome");
                } else {
                    System.out.println(word + " is not a Palindrome");
                }
            }
        }
    }
}