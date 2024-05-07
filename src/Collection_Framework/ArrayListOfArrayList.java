package Collection_Framework;

import java.util.*;
public class ArrayListOfArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        ArrayList<ArrayList<Integer>> li2=new ArrayList<>();
        li2.add(li);
        System.out.println(li2);
    }
}
