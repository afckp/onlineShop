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
    public List<Item> bucket = new ArrayList<>();

    public boolean addItemToBucket(Item item, Integer amount, Storage storage) {
        if (amount <= storage.storageMap.get(item)) {
            for (int i = 0; i < amount; i++){
                bucket.add(item);
            }
            Integer temp = storage.storageMap.get(item) - amount;
            storage.storageMap.put(item,temp);
            System.out.println(amount + " " + item.name + " was added to your bucket");
            return true;
        } else {
            throw new RuntimeException("Not enough items in stock, user want " + amount +
                    " but there are only " + storage.storageMap.get(item));
        }

    }

    public Integer calculateSalePercent() {
        if (name == "Liza") {
            return 15;
        } else if (name == "Tanya") {
            return 99;
        }
        return 0;
    }

    public boolean deleteItemFromBucket(Item item) {
        bucket.remove(item);
        System.out.println(item.name + " was deleted from your bucket");
        return true;
    }

    public Integer calculateSumForBucket() {
        Integer sum = 0;
        System.out.println(bucket.size());
        for(int i = 0; i < bucket.size(); i++) {
            Item temp = bucket.get(i);
            sum = sum + temp.price;
        }
        float result = sum - (sum / 100 * calculateSalePercent());
        System.out.println("Total price is: " + result);
        return (int) result;
    }

    //public boolean purchaseItems()


}
