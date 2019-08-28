package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double p, int qty) {
       //去掉super()
        this.description = description;
        this.price = p;
        this.quantity = qty;
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

    public double calculateAmount() {

        return price * quantity;
    }
    public String generateOrderInfomation(){
        return this.getDescription() + '\t'
                + this.getPrice() + '\t'
                + this.getQuantity() + '\t'
                + this.calculateAmount() + '\n';
    }
}