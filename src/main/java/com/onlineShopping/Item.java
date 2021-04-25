package com.onlineShopping;

public class Item {

  //  double price;
   private double price;
   private int quantity;
   private String name;

    public Item() {

    }
    Item(String name, double price){
        this.name =name;
        this.price=price;
    //    this.quantity=quantity;
     //   System.out.println(this.name);
    }

    double getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }
}
