 class PalindromeApp {
    public static void main(String[] args) {

        class PalindromeChecker {

            public static void main(String[] args) {

                // Original string
                String text = "madam";

                // Create Deque
                Deque<Character> deque = new LinkedList<>();

                // Insert characters into deque
                for (int i = 0; i < text.length(); i++) {
                    deque.addLast(text.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();

                    if (front != rear) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display result
                if (isPalindrome) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }

            }
        }


    }
}
