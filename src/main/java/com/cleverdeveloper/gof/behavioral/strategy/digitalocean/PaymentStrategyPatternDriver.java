package com.cleverdeveloper.gof.behavioral.strategy.digitalocean;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 3:17 PM
*/

public class PaymentStrategyPatternDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item itemOne = new Item("1234", 10);
        Item itemTwo = new Item("5678", 20);

        cart.addItem(itemOne);
        cart.addItem(itemTwo);

        //Pay by PayPal
        cart.pay(new PayPalStrategy("azerty@gmail.com","azerty@123654"));

        //Pay by Credit Card
        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "786", "12/15"));
    }
}
