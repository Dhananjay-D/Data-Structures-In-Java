// push(): Adds an element to the top of the stack.
// pop(): Removes and returns the element from the top of the stack.
// peek(): Returns the element from the top of the stack without removing it.
// isEmpty(): Returns true if the stack is empty, false otherwise.
// size(): Returns the number of elements in the stack.
// clear(): to clear all the data from collection.
// get(): to get a data from collection specifying index of req element.
// search() : search for an object specified and returns index number
// contains() : check for an element present or not in stack returns t/f

import java.util.*;

public class Stacks {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Stack: " + s);
        s.pop();
        System.out.println("Stack: " + s);
        System.out.println("peek elem: " + s.peek());

        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not empty");
        }

        System.out.println(s.get(1));

        System.out.println("Index of 3 in stack is: "+s.search(3));

        System.out.println("Item 3 is present in stack: "+s.contains(3));

        System.out.println("Stack elements are: ");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
