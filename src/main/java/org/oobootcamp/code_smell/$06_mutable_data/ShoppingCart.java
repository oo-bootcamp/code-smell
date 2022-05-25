package org.oobootcamp.code_smell.$06_mutable_data;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private int itemsCount;
    private double totalPrice;
    private Map<Item, Integer> items = new HashMap<>();

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addItem(Item item) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + 1);
        } else {
            items.put(item, 1);
        }
        totalPrice += item.getPrice();
    }
}