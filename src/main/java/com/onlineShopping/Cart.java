package com.onlineShopping;

import java.util.*;


public class Cart {

   ArrayList<Item> items = new ArrayList<>();

    public int size() {
      return  items.size();
    }

    public void addItem(Item item) {
    items.add(item);
    }

    public double getTotal() {
       double Total = 0;
        for (Item i : items){
          Total = Total + i.getPrice();
          //  System.out.println(i.getPrice());
        }
      return Total;
//        return 3.00;
    }

    public int getQuantity(String item) {
       int count=0;
        for (Item i : items){
           if (i.getName().equals(item)){
               count=count +1;
           }
        }
    return count;
    }
}
