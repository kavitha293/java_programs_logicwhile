class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class main {


    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    
    static Node removeByValue(Node head, int value) {
        if (head == null) return null;

        if (head.data == value) {
            return head.next;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

   
    static Node removeAtPosition(Node head, int index) {
        if (head == null) return null;

        if (index == 0) {
            return head.next;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) return head;

        current.next = current.next.next;
        return head;
    }

  
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;

        
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        head = insert(head, 50);

        System.out.println("Original List:");
        printList(head);

     
        head = removeByValue(head, 30);
        System.out.println("After removing value 30:");
        printList(head);

       
        head = removeAtPosition(head, 2);
        System.out.println("After removing node at index 2:");
        printList(head);

       
        head = null;
        System.out.println("After removing entire list:");
        printList(head);
    }
}
