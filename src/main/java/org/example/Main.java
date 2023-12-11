package org.example;

import models.Item;
import models.User;

public class Main {
    public static void main(String[] args) {

        User katya = new User("Katya");


        Item item1 = new Item("Mandarine", 20);

        katya.addItemToBucket(item1);
    }

}