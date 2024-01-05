package models;

import models.Item;

import java.util.*;

public class Storage {
    Integer amountOfItems;
    Integer amountOfMoney;
    public List<Item> allItems = new ArrayList<>();
    Map<Item, Integer> storageMap = new HashMap<>();

    public Storage() {
        addItemInList();
    }


    public boolean addItemInList() {
        Item item1 = new Item("Teddy bear", 500);
        Item item2 = new Item("Towel", 350);
        Item item3 = new Item("Candle", 200);
        Item item4 = new Item("Sleep mask", 190);
        Item item5 = new Item("Pillow", 400);
        Item item6 = new Item("Slippers", 470);
        Item item7 = new Item("Comb", 180);
        Item item8 = new Item("Mug", 339);
        Item item9 = new Item("Mirror", 700);

        allItems.addAll(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9));

        storageMap.put(item1, 100);
        storageMap.put(item2, 2);
        storageMap.put(item3, 550);
        storageMap.put(item4, 90);
        storageMap.put(item5, 230);
        storageMap.put(item6, 191);
        storageMap.put(item7, 340);
        storageMap.put(item8, 700);
        storageMap.put(item9, 75);

        return true;
    }


    public void printStorage() {
        for (int i = 0; i < allItems.size(); i++) {
            Item temp = allItems.get(i);
            System.out.println(temp.name + ", " + temp.price + ", " + storageMap.get(temp));
        }
    }

    public Item getItemByName(String name) {
        for (int i = 0; i < allItems.size(); i++) {
            Item temp = allItems.get(i);
            if (temp.name.equals(name)) {
                return temp;
            }
        }

        throw new NoSuchElementException("Item with name " + name + " not found");
    }

}
