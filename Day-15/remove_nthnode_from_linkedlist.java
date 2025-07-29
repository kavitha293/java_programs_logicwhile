class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class remove_nthnode_from_linkedlist {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node to handle edge cases (like removing head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Step 1: Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Step 2: Move fast to the end, maintaining the gap
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 3: Skip the target node
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Utility to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Example run
    public static void main(String[] args) {
        RemoveNthFromEnd solution = new RemoveNthFromEnd();

        // Example 1: [1,2,3,4,5], n = 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Before: ");
        solution.printList(head1);

        head1 = solution.removeNthFromEnd(head1, 2);

        System.out.print("After:  ");
        solution.printList(head1);

        // Example 2: [1], n = 1
        ListNode head2 = new ListNode(1);
        System.out.print("Before: ");
        solution.printList(head2);

        head2 = solution.removeNthFromEnd(head2, 1);

        System.out.print("After:  ");
        solution.printList(head2);
    }
}
