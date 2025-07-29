

class ListNode {
    ListNode prev;
    int data;
    ListNode next;

    ListNode(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class Traversal {
    static void traversal(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class TraversalBackward {
    static void traversalBackward(ListNode tail, ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    
}

class DoublyLinkedList {
    ListNode head = null;
    ListNode tail = null;

    void insertAtBegin(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head =newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    void insert_at_end(int data){
        ListNode new_Node=new ListNode(data);
        if(head==null){
            head=new_Node;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_Node;
        new_Node.prev=temp; 
        return;

    }
    void insert_at_position(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            insertAtBegin(data);
            return;
        }
        ListNode temp = head;
        int count=1;
        while(count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
   void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        tail = temp.prev;
    }
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            deleteAtBegin();
            return;
        }
        ListNode temp = head;
        int count = 1;
        while (count < position && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }
}

public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        Traversal.traversal(list.head);
        TraversalBackward.traversalBackward(list.tail, list.head);

        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insert_at_end(40);
        list.insert_at_end(50);
        list.insert_at_position(25, 2);
        list.deleteAtBegin();
        list.deleteAtEnd();
        list.deleteAtPosition(3);

        Traversal.traversal(list.head);
        TraversalBackward.traversalBackward(list.tail, list.head);
    }
}
