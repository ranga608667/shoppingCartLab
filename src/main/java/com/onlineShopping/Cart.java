package com.onlineShopping;

import java.util.*;
import java.util.stream.Collectors;


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
           }
      return Total;
//        return 3.00;
    }

    public ArrayList<Integer> getQuantity() {
   ArrayList<Integer> Count = new ArrayList<Integer>();
    Map<String, Integer> quantityMap= items.stream().collect(Collectors.groupingBy(Item :: getName,
            Collectors.summingInt(Item :: getQuantity)));
    ArrayList<Integer> mapCount= new ArrayList<Integer>(quantityMap.values());
    return mapCount;
    }

    public Map<String, Integer> getItemizedQuantity() {
        ArrayList<Integer> Count = new ArrayList<Integer>();

        Map<String, Integer> quantityMap= items.stream().collect(Collectors.groupingBy(Item :: getName,
                Collectors.summingInt(Item :: getQuantity)));

        return quantityMap;
    }
    public void removeItem(Item item) {
        items.remove(item);
    }

//    public ArrayList<Integer> getPriceAndQuantity() {
//        ArrayList<Integer> Count = new ArrayList<Integer>();
//        Map<String, Integer> quantityMap= items.stream().collect(Collectors.groupingBy(Item :: getName,
//                Collectors.summingInt(Item :: getQuantity)));
//        Map<String, Integer> priceMap= items.stream().collect(Collectors.groupingBy(Item :: getName,
//                Collectors.summingDouble(Item :: getPrice)));
//        ArrayList<Integer> mapCount= new ArrayList<Integer>(quantityMap.values());
//        return mapCount;
//    }

}
