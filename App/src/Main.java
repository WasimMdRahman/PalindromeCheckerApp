//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        class PalindromeIgnoreCaseSpace {

            public static void main(String[] args) {

                String text = "Madam In Eden Im Adam";

                // Normalize the string
                String normalized = text.replaceAll("\\s+", "").toLowerCase();

                // Reverse the normalized string
                String reversed = "";
                for (int i = normalized.length() - 1; i >= 0; i--) {
                    reversed = reversed + normalized.charAt(i);
                }

                // Compare strings
                if (normalized.equals(reversed)) {
                    System.out.println(text + " is a Palindrome (ignoring spaces and case)");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }

    }
}