
// remove all the occurences of the given number

import java.util.*;
public class RemoveElem {
    public static void main(String[] args){
        int elem=3;
        int[] arr={1,2,2,3,3,3,4,5};
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:arr){
            li.add(i);
        }
        while(li.contains(elem)){
            int j=li.indexOf(elem);
            li.remove(j);
        }
        System.out.println(li);
    }
}
