package org.example.collectionframework.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(4);
        list.add(4,6);
        System.out.println(list);

        list.set(2,8);
        System.out.println("After Set : " + list);
    }
}
