package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public Order (List<Item> orderItems, Integer totalSum) {
        number = getNextNumber();
        this.orderItems = orderItems;
        date = LocalDateTime.now();
        this.totalSum = totalSum;
    }
    public Integer number;
    List<Item> orderItems = new ArrayList<>();
    LocalDateTime date;
    Integer totalSum;
    static Integer nextNumber = 0;

    public static Integer getNextNumber() {

        nextNumber++;
        return nextNumber;
    }

    @Override
    public String toString() {
        return "Order number " + number + " is created. Total sum: " + totalSum + ". Date: " + date.toString() +
                ". Items amount " + orderItems.size();
    }
}
