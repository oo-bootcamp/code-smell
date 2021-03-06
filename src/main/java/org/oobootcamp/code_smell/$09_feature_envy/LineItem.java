package org.oobootcamp.code_smell.$09_feature_envy;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double p, int quantity) {
        super();
        this.description = description;
        this.price = p;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}