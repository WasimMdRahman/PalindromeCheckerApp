class Palin {
    public static void main(String[] args) {

        class PalindromeLinkedList {

            // Node class
            static class Node {
                char data;
                Node next;

                Node(char data) {
                    this.data = data;
                    this.next = null;
                }
            }

            // Head of linked list
            Node head;

            // Insert character at end
            void add(char data) {
                Node newNode = new Node(data);

                if (head == null) {
                    head = newNode;
                    return;
                }

                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = newNode;
            }

            // Check palindrome
            boolean isPalindrome() {

                if (head == null || head.next == null)
                    return true;

                Node slow = head;
                Node fast = head;

                // Find middle using fast and slow pointer
                while (fast.next != null && fast.next.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }

                // Reverse second half
                Node prev = null;
                Node curr = slow.next;

                while (curr != null) {
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                // Compare both halves
                Node first = head;
                Node second = prev;

                while (second != null) {
                    if (first.data != second.data)
                        return false;

                    first = first.next;
                    second = second.next;
                }

                return true;
            }

            public static void main(String[] args) {

                String text = "madam";

                PalindromeLinkedList list = new PalindromeLinkedList();

                // Convert string to linked list
                for (char c : text.toCharArray()) {
                    list.add(c);
                }

                // Check palindrome
                if (list.isPalindrome()) {
                    System.out.println(text + " is a Palindrome");
                } else {
                    System.out.println(text + " is not a Palindrome");
                }
            }
        }


    }
}

