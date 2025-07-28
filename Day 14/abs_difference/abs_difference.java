class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    ListNode head;

    void traversal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void insert_begin(int data) {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
    }

    void insert_end(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void position(int pos, int data) {
        ListNode newnode = new ListNode(data);
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }
        ListNode temp = head;
        int cur_pos = 1;
        while (temp != null && cur_pos < pos - 1) {
            temp = temp.next;
            cur_pos++;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void countValue(int value) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            if (current.data == value) {
                count++;
            }
            current = current.next;
        }
        System.out.println("Count of " + value + ": " + count);
    }

    int sum() {
        int sum = 0;
        ListNode current = head;
        while (current != null) {
            sum += current.data;
            current = current.next.next ;
        }
        return sum;
    }

    int asum() {
        int asum = 0;
        ListNode current = head;
        while (current != null) {
            asum += current.next.data;
            current = current.next.next;
        }
        return asum;
    }
}

public class abs_difference {
    public static void main(String[] args) {
        Linkedlist ob = new Linkedlist();

        ob.insert_end(1);
        ob.insert_end(2);
        ob.insert_end(3);
        ob.insert_end(4);
        ob.insert_end(5);
        ob.insert_end(6);

        ob.traversal();
        ob.countValue(10);

        int sum = ob.sum();
        int asum = ob.asum();

        System.out.println("Alternate sum from head: " + sum);
        System.out.println("Alternate sum from second node: " + asum);
        System.out.println("sum - asum = " + Math.abs((sum - asum)));
    }
}
