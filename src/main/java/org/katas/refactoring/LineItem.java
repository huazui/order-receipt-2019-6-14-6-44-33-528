package org.katas.refactoring;

public class LineItem {
    private String descrition;
    private double price;
    private int quantity;

    public LineItem(String desc, double p, int qty) {
        super();
        this.descrition = desc;
        this.price = p;
        this.quantity = qty;
    }

    public String getDescription() {
        return descrition;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double totalAmount() {
        return price * quantity;
    }
}