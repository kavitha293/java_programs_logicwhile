public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        int lenA = 0, lenB = 0;

        while (a != null) {
            lenA++;
            a = a.next;
        }

        while (b != null) {
            lenB++;
            b = b.next;
        }

        int diff = Math.abs(lenA - lenB);

        a = headA;
        b = headB;

        if (lenA > lenB) {
            
            for (int i = 0; i < diff; i++) {
                a = a.next;
            }
        } 
        else {
            for (int i = 0; i < diff; i++) {
                b = b.next;
            }
        }

        while (a != null && b != null) {
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
    }
}
