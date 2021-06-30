package com.example.exam32.bookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookStoreTest {
    @Test
    public void testSameBook() {
        Integer[] cart = {1, 1, 1, 1};
        BookStore store = new BookStore(cart);
        double expect = 4 * 100;
        double result = store.priceCalculate();
        assertEquals(expect, result);
    }

    @Test
    public void testUniqueBook() {
        Integer[] cart = {1, 2, 3, 4, 5};
        BookStore store = new BookStore(cart);
        double expect = 100 * 5 * 0.75;
        double result = store.priceCalculate();
        assertEquals(expect, result);
    }

    @Test
    public void testSeveralDiscounts() {
        Integer[] cart = {1, 1, 2, 2, 3, 4};
        BookStore store = new BookStore(cart);
        double expect = (100 * 4 * 0.8) + (100 * 2 * 0.95);
        double result = store.priceCalculate();
        assertEquals(expect, result);
    }

}