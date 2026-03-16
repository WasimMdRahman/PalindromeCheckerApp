import java.util.*;

class PalindromePerformance {

    // Method 1: Reverse String
    static boolean reverseMethod(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    // Method 2: Two Pointer
    static boolean twoPointerMethod(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack
    static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray())
            stack.push(c);

        for (char c : text.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "madam";

        // Reverse Method Timing
        long start1 = System.nanoTime();
        reverseMethod(text);
        long end1 = System.nanoTime();

        // Two Pointer Timing
        long start2 = System.nanoTime();
        twoPointerMethod(text);
        long end2 = System.nanoTime();

        // Stack Method Timing
        long start3 = System.nanoTime();
        stackMethod(text);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Algorithm Performance (nanoseconds):");
        System.out.println("Reverse Method: " + (end1 - start1));
        System.out.println("Two Pointer Method: " + (end2 - start2));
        System.out.println("Stack Method: " + (end3 - start3));
    }
}
