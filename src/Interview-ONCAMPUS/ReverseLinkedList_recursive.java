// Reversing a linked list recursively using three pointers : prev, temp, front.
// time complexity : O(N)
// Space complexity : O(1)
// Better as compared to iterative
class ListNodes {
    int val;
    ListNodes next;

    ListNodes() {}

    ListNodes(int val) {
        this.val = val;
    }

    ListNodes(int val, ListNodes next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList_recursive {
    public static ListNodes reverseList(ListNodes head) {
    ListNodes temp=head;
    ListNodes prev=null;
    ListNodes front;
    while(temp!=null){
        front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
    head=prev;
    return head;
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNodes node5 = new ListNodes(5);
        ListNodes node4 = new ListNodes(4, node5);
        ListNodes node3 = new ListNodes(3, node4);
        ListNodes node2 = new ListNodes(2, node3);
        ListNodes node1 = new ListNodes(1, node2);

        System.out.println("Original Linked List:");
        printLinkedList(node1);

        ListNodes reversed = reverseList(node1);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversed);
    }

    private static void printLinkedList(ListNodes head) {
        ListNodes current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
