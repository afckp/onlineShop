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

    public boolean addItemToBucket(Item item, Integer amount, Storage storage) {
        if (amount <= storage.storageMap.get(item)) {
            bucket.add(item);
            Integer temp = storage.storageMap.get(item) - amount;
            storage.storageMap.put(item,temp);
            System.out.println(amount + " " + item.name + " was added to your bucket");
            return true;
        } else {
            throw new RuntimeException("Not enough items in stock, user want " + amount +
                    " but there are only " + storage.storageMap.get(item));
        }

    }

    public boolean deleteItemFromBucket(Item item) {
        bucket.remove(item);
        System.out.println(item.name + " was deleted from your bucket");
        return true;
    }

    //public boolean purchaseItems()


}
