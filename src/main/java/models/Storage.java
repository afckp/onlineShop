package models;

import models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storage {
    Integer amountOfItems;
    Integer amountOfMoney;
    List<Item> allItems = new ArrayList<>();

    public Storage(){
        addItemInList();
    }


    public boolean addItemInList(){
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

        return true;
    }

    public void printStorage(){
        for (int i = 0; i < allItems.size(); i++){

            System.out.println(allItems.get(i).name+", "+allItems.get(i).price);
        }
    }

}
