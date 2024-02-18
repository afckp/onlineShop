package org.example;

import models.Item;
import models.Order;
import models.Storage;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


public class Main {
    Storage storage = new Storage();

    public static void main(String[] args) {

        User katya = new User("Katya");
        User rita = new User("Rita");
        User liza = new User("Liza");
        User tanya = new User("Tanya");



    }
    @Test // тест проверяет правильность суммы корзины пользователя при двух полотенцах и пяти кружках
    void testUserBucketSum() {

        User katya = new User("Katya");
        katya.addItemToBucket(storage.getItemByName("Towel"),2, storage);
        katya.addItemToBucket(storage.getItemByName("Mug"), 5, storage);
        Integer result = katya.calculateSumForBucket();

        Assertions.assertEquals(2395, result);
    }

    @Test // тест проверяет происходит ли удаление у пользователя из корзины
    void testDeleteItemsFromBucket() {
        User rita = new User("Rita");
        Item candle = storage.getItemByName("Candle");
        Item mirror = storage.getItemByName("Mirror");
        rita.addItemToBucket(candle, 5, storage);
        rita.addItemToBucket(mirror, 1, storage);
        rita.deleteItemFromBucket(mirror);

        Integer result = rita.bucket.size();
        Assertions.assertEquals(5, result);

    }

    @Test //
    void testSaleForLiza() {
        User liza = new User("Liza");
        Item candle = storage.getItemByName("Candle");
        liza.addItemToBucket(candle, 1, storage);

        Assertions.assertEquals(170, liza.calculateSumForBucket());
    }

    @Test // тестирует базовый случай одного заказа
    void testmakeOrder() {
        User katya = new User("Katya");
        katya.addItemToBucket(storage.getItemByName("Towel"),2, storage);
        katya.addItemToBucket(storage.getItemByName("Mug"), 5, storage);
        Order orderKatya = katya.makeOrder();
        System.out.println(orderKatya.toString());

    }


    @Test // тестирует создание двух заказов
    void testMakeTwoOrders() {
        User katya = new User("Katya");
        katya.addItemToBucket(storage.getItemByName("Towel"),2, storage);
        katya.addItemToBucket(storage.getItemByName("Mug"), 5, storage);
        User liza = new User("Liza");
        liza.addItemToBucket(storage.getItemByName("Candle"),3, storage);

        Order orderKatya = katya.makeOrder();
        System.out.println(orderKatya.toString());

        Order orderLiza = liza.makeOrder();
        System.out.println(orderLiza.toString());

        Assertions.assertEquals(1, orderKatya.number);
        Assertions.assertEquals(2, orderLiza.number);

    }




}