package Collection_Framework;
import java.sql.SQLOutput;
import java.util.*;

//        The PriorityQueue class in Java is part of the java.util package.
//        It is known that a Queue follows the FIFO(First-In-First-Out) Algorithm,
//        but the elements of the Queue are needed to be processed according to the priority,
//        that’s when the PriorityQueue comes into play.

//        By default, the PriorityQueue in Java is implemented using a binary heap data structure,
//        (tree like)specifically a min-heap. This means that the element with the smallest value
//        (or highest priority, depending on the comparator) is always at the root of the heap,
//        and is the first element to be removed. The heap structure ensures that the offer
//        (insert) and poll (remove) operations have a time complexity of O(log n), where n
//        is the number of elements in the queue.


//Methods:
//By default it is min heap, for max heap -> pass arg as Collections.reverseOrder()
//  add(elem)
//  remove(elem)
//  poll() -> returns & remove root elem
//  peek() -> return peek elem
//  size() -> get size
//  isEmpty()
//  Iterator used for iterating over the elements

public class PriorityQueuee {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int n1=5, n2=17, n3=75;
        minHeap.add(n2);
        minHeap.add(n1);
        minHeap.add(n3);

        System.out.println(minHeap.size());

        System.out.println("smallest elem: "+minHeap.peek());
        minHeap.poll();
        System.out.println("smallest elem: "+minHeap.peek());

        System.out.println(minHeap.size());
        System.out.println(minHeap);

        System.out.println();

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        n1=15;
        n2=100;
        n3=50;
        maxHeap.add(n1);
        maxHeap.add(n2);
        maxHeap.add(n3);

        System.out.println(maxHeap.size());

        System.out.println("largest elem: "+maxHeap.peek());
        maxHeap.poll();
        System.out.println("largest elem: "+maxHeap.peek());

        System.out.println(maxHeap.size());
        System.out.println(maxHeap);
    }
}
