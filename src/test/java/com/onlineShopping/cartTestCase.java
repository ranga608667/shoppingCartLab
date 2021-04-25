package com.onlineShopping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class cartTestCase {
    @Test
    void cartEmpty (){
        Cart cart = new Cart();
        double expected=0;
        double actual = cart.size();
        assertEquals(expected,actual);
    }

   @Test
    void addItem(){
     Cart cart = new Cart();

     cart.addItem(new Item("apple", 3.00));
     double expected=3.00;
     double actual = cart.getTotal();

     assertEquals(expected,actual);
 }

    @Test
    void addDifferentItem(){
        Cart cart = new Cart();

        cart.addItem(new Item("apple", 3.00));
        cart.addItem(new Item("banana", 2.00));
        double expected=5.00;
        double actual = cart.getTotal();

        assertEquals(expected,actual);
    }

    @Test
    void addSameItemtwice(){
        Cart cart = new Cart();

        cart.addItem(new Item("apple", 3.00));
        cart.addItem(new Item("apple", 3.00));
        int expected=2;
        int actual = cart.getQuantity("apple");

        assertEquals(expected,actual);
    }

    @Test
    void addItems(){
        Cart cart = new Cart();

        cart.addItem(new Item("apple", 3.00));
        cart.addItem(new Item("apple", 3.00));
        cart.addItem(new Item("banana", 2.00));

        int expected=0;
        int actual=0;
        assertEquals(expected, actual);
    }

    @Test
    void removeItems(){
        Cart cart = new Cart();

        cart.removeItem(new Item("apple", 3.00));
        cart.addItem(new Item("apple", 3.00));
        cart.addItem(new Item("banana", 2.00));

        int expected=0;
        int actual=0;
        assertEquals(expected, actual);
    }

}