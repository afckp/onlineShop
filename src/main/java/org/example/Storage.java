package org.example;

import models.Item;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    public Storage(Integer amountOfItems){
        this.amountOfItems = amountOfItems;
    }
    Integer amountOfItems;
    List<Item> allItem= new ArrayList<>();

}
