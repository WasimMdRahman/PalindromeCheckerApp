public class Main {
    public static void main(String[] args) {


        class StackStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String text) {

                Stack<Character> stack = new Stack<>();

                for (char c : text.toCharArray()) {
                    stack.push(c);
                }

                for (char c : text.toCharArray()) {
                    if (c != stack.pop()) {
                        return false;
                    }
                }

                return true;
            }
        }

// Deque Strategy Implementation
        class DequeStrategy implements PalindromeStrategy {

            public boolean isPalindrome(String text) {

                Deque<Character> deque = new LinkedList<>();

                for (char c : text.toCharArray()) {
                    deque.addLast(c);
                }

                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        return false;
                    }
                }

                return true;
            }
        }

// Context Class
        class PalindromeChecker {

            private PalindromeStrategy strategy;

            // Inject strategy at runtime
            public PalindromeChecker(PalindromeStrategy strategy) {
                this.strategy = strategy;
            }

            public boolean check(String text) {
                return strategy.isPalindrome(text);
            }
        }

// Main class
        public class StrategyPalindromeApp {

            public static void main(String[] args) {

                String text = "madam";

                // Choose strategy dynamically
                PalindromeStrategy strategy = new StackStrategy();
                // PalindromeStrategy strategy = new DequeStrategy();

                PalindromeChecker checker = new PalindromeChecker(strategy);

                if (checker.check(text)) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }

    }
}