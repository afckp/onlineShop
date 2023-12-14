package models;

import models.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public Storage(Integer amountOfItems){
        this.amountOfItems = amountOfItems;
    }
    Integer amountOfItems;
    Integer amountOfMoney;
    List<Item> allItem= new ArrayList<>();

}
