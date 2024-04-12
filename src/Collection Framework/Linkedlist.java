// Implementation of Linked-List using collection framework.

// Linked-List Methods:

// add(elem)
// add(index,elem)
// addFirst()
// addLast()
// remove()
// removeFirst()
// removeLast()
// contains()
// indexOf()
// peek()
// peekFirst()
// peekLast()
// set(index,elem) - modify the elem
// get()
// clear()
// size()

//  insertion/deletion - O(1)
//  searching - O(N)

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> li=new LinkedList<>();

        // both methods add elem at the last
        li.add("love");
        li.addLast("mumbai");

        // this adds the elem to the first of the list
        li.addFirst("I");

        // this adds the elem to the specified index
        li.add(1,"really");

        System.out.println(li);

        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " -> ");
        }
        System.out.println("null");

        // checks whether elem is present or not
        System.out.println(li.contains("mumbai"));

        // returns first elem in list
        System.out.println(li.peek());
        System.out.println(li.peekFirst());

        // returns the last elem
        System.out.println(li.peekLast());

        // if elem is present returns its index else: -1
        System.out.println(li.indexOf("mumbai"));

        // removes last element
        li.removeLast();
        System.out.println(li);

        // removes first element
        li.removeFirst();
        System.out.println(li);

        // removes elem specified by the index
        li.remove(0);
        System.out.println(li);
    }
}
