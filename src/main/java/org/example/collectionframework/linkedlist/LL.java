package org.example.collectionframework.linkedlist;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);

        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
    }
}
