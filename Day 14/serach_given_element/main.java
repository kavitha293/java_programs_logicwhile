class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {

    // Function to search for a given key
    static boolean search(Node head, int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }

        return false;
    }

    // Helper function to insert node at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        // Create linked list: 10 -> 20 -> 30 -> 40
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);

        int key = 30;

        if (search(head, key))
            System.out.println(key + " is found in the linked list.");
        else
            System.out.println(key + " is not found in the linked list.");
    }
}
