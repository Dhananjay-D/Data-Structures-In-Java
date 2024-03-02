// Implementation of Linked-List using collection framework.

// Linked-List Methods:

// add()
// addFirst()
// addLast()
// remove()
// removeFirst()
// removeLast()
// get()
// size()

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is"); // add just add to last
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}
