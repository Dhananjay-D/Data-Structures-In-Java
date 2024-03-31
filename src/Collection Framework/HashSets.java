//HashSet is a unordered collection of data which only contains unique element
//  Methods:

// add()
// remove()
// size()
// contains()
// Collections.sort()
// cannot use get Method to access elements directly

import java.util.Iterator;
import java.util.HashSet;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(2);

        //printing set:
        System.out.println(set1);

        //searching element:
        System.out.println("element 3 is present: "+set1.contains(3));

        //Iterating must be using Iterator:
        Iterator it=set1.iterator();
        while(it.hasNext()){ // checks whether their is elem or not next
            System.out.print(it.next()+" ");    // prints the next elem
        }
    }
}
