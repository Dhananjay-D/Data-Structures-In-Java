// ArrayList Methods:

// add()
// remove()
// set()
// get()
// size()
// contains()
// Collections.sort()
// clear()
// isEmpty()
// addAll(another collection obj)
// containsAll(another collection obj)
// removeAll(another collection obj)

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        // adding elements
        li.add(34);
        li.add(23);
        li.add(2);
        li.add(10);
        li.add(56);

        // deleting a particular element
        li.remove(1);
        System.out.println(li);

        // adding elem at req location
        li.add(2, 58);
        System.out.println(li);

        // getting an element from arrayList
        System.out.println(li.get(0));

        // modifying current elem
        li.set(1, 96);
        System.out.println(li);

        // getting size of an list
        System.out.println(li.size());

        // sorting an list
//        Collections.sort(li);
//        System.out.println(li);

        li.clear(); // to clear the arrayList

        // checking whether the arraylist is empty or not
        System.out.println(li.isEmpty());

    }
}