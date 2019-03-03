package com.jhj.test;

/**
 * Created by huajianJin on 2019/3/3.
 */
public class Stock {

    private String name;

    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

}
