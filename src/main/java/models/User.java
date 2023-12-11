package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    public User(String name) {
        this.name = name;
    }

    public User() {

    }

    String name;
    String cardNumber;
    List<Item> bucket = new ArrayList<>();

    public boolean addItemToBucket(Item item){
        bucket.add(item);
        System.out.println(item.name+" was added to your bucket");
        return true;
    }


}
