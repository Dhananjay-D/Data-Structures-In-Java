// ArrayList Methods:

// add(ele)
// add(index,ele)
// indexOf()  -  to get index of the elem specified  (if elem not present then returns -1)
// remove()
// set()
// get()
// size()
// contains()
// Collections.sort(li)  --> ascending order
// Collections.sort(li, Collections.reverseOrder());  -->descending order
// Collections.reverse(li)  --> reverse
// clear()
// isEmpty()
// addAll(another collection obj)
// containsAll(another collection obj)
// removeAll(another collection obj)

//  insertion - O(N)  ..time to shift rest elements
//  searching - O(1)   ..using indexOf()

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