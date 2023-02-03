package com.cleverdeveloper.functional_interfaces.supplier;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/3/2023 3:45 PM
*/

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDrivenPattern {

    public static void main(String[] args) {

        // Simple case of Supplier
        Supplier<Long> randomId = () -> new Random().nextLong();
        Supplier<UUID> uuid = () -> UUID.randomUUID();

        Trade trade = new Trade(null, null, null);
        populate(trade, randomId);
        populate(trade, uuid);

        System.out.println(trade);
    }

    public static <R> void populate(Trade trade, Supplier<R> supplier) {
        trade.setDate(new Date());
        trade.setId(String.valueOf(supplier.get()));
        trade.setLocation("SETIF");
    }
}
