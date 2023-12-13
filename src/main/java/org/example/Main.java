package org.example;

import models.Item;
import models.User;

public class Main {
    public static void main(String[] args) {

        User katya = new User("Katya");
        User rita = new User("Rita");
        User liza = new User("Liza");
        User tanya = new User("Tanya");


        Item item1 = new Item("Teddy bear", 500);
        Item item2 = new Item("Towel", 350);
        Item item3 = new Item("Candle", 200);
        Item item4 = new Item("Sleep mask", 190);
        Item item5 = new Item("Pillow", 400);
        Item item6 = new Item("Slippers", 470);
        Item item7 = new Item("Comb", 180);
        Item item8 = new Item("Mug", 339);


        katya.addItemToBucket(item1);

    }

}