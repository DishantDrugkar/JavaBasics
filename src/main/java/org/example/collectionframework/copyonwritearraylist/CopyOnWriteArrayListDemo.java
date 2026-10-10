package org.example.collectionframework.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Cheese");
        shoppingList.add("Peanut Butter");
        shoppingList.add("Dark Chocolate");

        System.out.println(shoppingList);
        System.out.println("-----------------------------------------");
        for(String list : shoppingList){
            if(list.equals("Dark Chocolate")){
                shoppingList.add("Almond Milk");
                System.out.println("Almond Milk is added to the shopping list. ");
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("Updated Shopping List : " + shoppingList);
    }
}
