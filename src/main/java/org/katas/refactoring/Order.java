package org.katas.refactoring;

import java.util.List;

public class Order {
    private String name;
    private String address;
    List<LineItem> lineItems;

    public Order(String name, String address, List<LineItem> lineItems) {
        //去掉super()
        this.name =  name;
        this.address = address;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
