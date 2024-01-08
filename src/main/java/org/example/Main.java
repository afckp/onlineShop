package org.example;

import models.Item;
import models.Storage;
import models.User;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printStorage();

        User katya = new User("Katya");
        User rita = new User("Rita");
        User liza = new User("Liza");
        User tanya = new User("Tanya");

        katya.addItemToBucket(storage.getItemByName("Towel"),2, storage);
        storage.printStorage();

        //System.out.println(storage.getItemByName("ball").toString());

    }


}