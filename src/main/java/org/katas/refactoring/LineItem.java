package org.katas.refactoring;

public class LineItem {
    private String desc;
    private double p;
    private int qty;

    public LineItem(String desc, double p, int qty) {
       //去掉super()
        this.desc = desc;
        this.p = p;
        this.qty = qty;
    }

    public String getDescription() {

        return desc;
    }

    public double getPrice() {
        return p;
    }

    public int getQuantity() {
        return qty;
    }

    public void setDesc(String desc) {//添加了set方法
        this.desc = desc;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    double totalAmount() {

        return p * qty;
    }
}