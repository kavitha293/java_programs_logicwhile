class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {

    // Function to find frequency of a given key
    static int getFrequency(Node head, int key) {
        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    // Helper function to add node at the end
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

        // Create the linked list: 1 -> 2 -> 3 -> 2 -> 4 -> 2
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 2);

        int key = 2;
        int freq = getFrequency(head, key);
        System.out.println("Frequency of " + key + " = " + freq);
    }
}
