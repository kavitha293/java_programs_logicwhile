class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class CircularLinkedList {
    ListNode head = null;

    void insertAtBegin(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    void traversal() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        ListNode temp = head;
        do {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }
}

public class CLL {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBegin(10);
        cll.insertAtBegin(20);
        cll.insertAtBegin(30);
        cll.traversal();
    }
}
