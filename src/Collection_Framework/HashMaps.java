
// Java HashMap class implements the Map interface which allows us to store key
// and value pair, where keys should be unique. If you try to insert
// the duplicate key, it will replace the element of the corresponding key.
// they are unordered
// HashMap<Integer,List<String>> map=new HashMap<>(); value can be of any datatype.

                    // Hashmap methods :
//put()
//containsKey()
//containsValue()
//get(keyName)
//remove(keyName)
//equals()

import java.util.*;
public class HashMaps {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Aaron");
        map.put(2,"Aachal");
        map.put(3,"Avinash");
        map.put(4,"Ganesh");

        //direct print
        System.out.println(map);

        //searching
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Aachal"));

        //getting data
        System.out.println("1 value is: "+map.get(1));

        //deleting data
        map.remove(1);
        System.out.println(map);



        // for iterating in a hashmap
        for(Map.Entry<Integer,String> item:map.entrySet()){
            System.out.println("key: "+item.getKey()+" Value: "+item.getValue());
        }



        //checking equality
        System.out.println(map.get(2).equals("Aachal"));
    }
}
