package org.oobootcamp.code_smell.$06_mutable_data;

public class Item {
    private String name;
    private double price;

    public double getPrice() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
