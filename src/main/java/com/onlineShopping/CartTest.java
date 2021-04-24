package com.onlineShopping;

public class CartTest {
    private int value;
    private int item;
    public int getValue() {
        return value;
    }

    public int getItem() {
        return item;
    }

    public int addValue(int... values) {
        int total = 0;
        for(int j=0; j<values.length; j++) {
            total=total+values[j];
        }
        return total;
    }
}
