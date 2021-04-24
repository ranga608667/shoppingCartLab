package com.onlineShopping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class cartTestCase {
    @Test
    void cartEmpty (){
        CartTest cartTest = new CartTest();
        int expected=0;
        int actual = cartTest.getValue();
        assertEquals(expected,actual);

        int expecteditem=0;
        int actualItem = cartTest.getItem();
        assertEquals(expecteditem,actualItem);
    }

    @Test
    void cartAddTwoItems(){
        CartTest cartTest1 = new CartTest();
        int expected = 5;
        int actual=cartTest1.addValue(2,3);
        assertEquals(expected,actual);
    }

    @Test
    void cartAddManyItems(){
        CartTest cartTest1 = new CartTest();
        int expected = 10;
        int actual=cartTest1.addValue(2,3,5);
        assertEquals(expected,actual);
    }

    // Test git Push
}

//
//    Given that I a new shopper
//        When I begin shopping
//        Then I expect my cart to be empty

//    Given I have an empty cart
//    When I add an item
//        Then I expect the subtotal to be the price of the item
//
//        Given I have a cart with some items
//        When I add another item
//        Then I expect the subtotal to reflect the sum of all the items in my cart