package org.katas.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String customerAddress;
    List<LineItem> lineItems;

    public Order(String nm, String addr, List<LineItem> lineItems) {
        this.customerName = nm;
        this.customerAddress = addr;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
