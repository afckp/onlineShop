package models;

public class Item {
    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.price;
    }

    String name;
    Integer price;

}
