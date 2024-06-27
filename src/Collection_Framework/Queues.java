// add()
// remove() : Returns the element after removing it
// peek(): Returns the element from the top of the stack without removing it.
// isEmpty(): Returns true if the stack is empty, false otherwise.
// size(): Returns the number of elements in the stack.
// clear(): to clear all the data from collection.
// contains() : check for an element present or not in stack returns t/f

import java.util.*;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> li = new LinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        System.out.println(li);
        System.out.println(li.remove());
        System.out.println(li);

//        for(int k=0;k<li.size();k++){
//            System.out.println(li.get(k));
//        }

        System.out.println("element at the front is: "+li.peek());

        System.out.println("element 3 is present in queue :"+li.contains(3));

        li.clear();

        System.out.println(li.size());

        System.out.println(li);

        while (!li.isEmpty()) {
            System.out.println(li.peek());
            li.remove();
        }
    }
}