 class PalindromeApp {
    public static void main(String[] args) {

        class PalindromeChecker {

            public static void main(String[] args) {

                // Original string
                String text = "madam";

                // Create Stack (LIFO)
                Stack<Character> stack = new Stack<>();

                // Create Queue (FIFO)
                Queue<Character> queue = new LinkedList<>();

                // Insert characters into both data structures
                for (int i = 0; i < text.length(); i++) {
                    char ch = text.charAt(i);
                    stack.push(ch);     // Push into stack
                    queue.add(ch);      // Enqueue into queue
                }

                boolean isPalindrome = true;

                // Compare dequeue (queue) with pop (stack)
                while (!queue.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Print result
                if (isPalindrome) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }


    }
}
