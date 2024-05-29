package Interview_ONCAMPUS;
// see leetcode for better understanding
import java.util.*;
public class IntersectionLinkedList {
    public static void main(String[] args) {
        // Create the first linked list: 1 -> 3 -> 5 -> 7 -> 9
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(3);
        headA.next.next = new ListNode(5);
        headA.next.next.next = new ListNode(7);
        headA.next.next.next.next = new ListNode(9);

        // Create the second linked list: 2 -> 4
        ListNode headB = new ListNode(2);
        headB.next = new ListNode(4);

        // Set intersection point: 4 -> 7 -> 9
        headB.next.next = headA.next.next.next; // 4 -> 7

        // Instantiate the solution object
        Solution solution = new Solution();

        // Find the intersection node
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);

        // Print the result
        if (intersectionNode != null) {
            System.out.println("The intersection node value is: " + intersectionNode.val);
        } else {
            System.out.println("No intersection node found.");
        }
    }
}

// ListNode class definition as provided
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Solution class definition as provided
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        LinkedList<ListNode> li = new LinkedList<>();
        ListNode head = null;
        ListNode t1 = headA;
        ListNode t2 = headB;
        while (t1.next != null) {
            li.add(t1);
            t1 = t1.next;
        }
        li.add(t1);
        while (t2 != null) {
            if (li.contains(t2)) {
                return t2;
            } else {
                t2 = t2.next;
            }
        }
        return head;
    }
}

