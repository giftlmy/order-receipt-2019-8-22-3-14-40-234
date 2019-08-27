package org.katas.refactoring;

import java.util.List;

public class Order {
    String nm;
    String addr;
    List<LineItem> li;

    public Order(String nm, String addr, List<LineItem> li) {
        //去掉super()
        this.nm = nm;
        this.addr = addr;
        this.li = li;
    }

    public String getCustomerName() {
        return nm;
    }

    public void setNm(String nm) {//添加了set方法
        this.nm = nm;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return li;
    }
}
