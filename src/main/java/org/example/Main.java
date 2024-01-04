package org.example;

import models.Item;
import models.Storage;
import models.User;

public class Main {
    public static void main(String[] args) {

        User katya = new User("Katya");
        User rita = new User("Rita");
        User liza = new User("Liza");
        User tanya = new User("Tanya");

        Storage storage = new Storage();
        storage.printStorage();

    }


}