package org.example.collectionframework.map.hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Dishant");
        map.put(2,"Thor");
        map.put(3,"Peter Parkar");

        System.out.println(map);

        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Peter Parkar"));

    }
}
