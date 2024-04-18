// this is the iterative way of reversing a linked list
// Time Complexity is  O(N)
// Space Complexity is O(N)
// So we move on to recursive way for reversing the linkedList

import java.util.Stack;
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList_Iterative {
    public static ListNode reverseList(ListNode head) {
        Stack<Integer> li = new Stack<>();
        ListNode t1 = head;
        while (t1 != null) {
            li.push(t1.val);
            t1 = t1.next;
        }
        t1 = head;
        while (!li.isEmpty()) {
            t1.val = li.pop();
            t1 = t1.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original Linked List:");
        printLinkedList(node1);

        ListNode reversed = reverseList(node1);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversed);
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
