package com.ironhack.day8.simple_junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Iphone 16", 1700.0, 4);
    }

    // constructor

    @Test
    void constructor_normalArguments_succeeds() {
        Product product = new Product("Iphone 16", 1700.0, 4);
    }

    @Test
    void constructor_invalidPrice_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Product("Iphone 16", -100.0, 1));
    }

    // sell

    @Test
    void sell_aboveQuantity_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> product.sell(5));
    }

    @Test
    void sell_normalArguments_succeeds() {
        product.sell(3);
        assertEquals(1, product.getStock());
    }

    @Test
    void sell_allStock_isInStockReturnsFalse() {
        product.sell(4);
        assertFalse(product.isInStock());
    }

    @Test
    void sell_getInventoryValue_returnsCorrectValue() {
        product.sell(2);
        assertEquals(2 * 1700, product.getInventoryValue());
    }

    // restock

    @Test
    void restock_zeroOrNegativeQuantity_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> product.restock(0));
        assertThrows(IllegalArgumentException.class, () -> product.restock(-1));
    }

    @Test
    void restock_normalArguments_succeeds() {
        product.restock(3);
        assertEquals(7, product.getStock());
    }

    // isInStock

    @Test
    void isInStock_returnsTrue_stockNotZero() {
        assertTrue(product.isInStock());
    }

    @Test
    void isInStock_returnsFalse_stockZero() {
        Product product = new Product("Iphone 16", 1700.0, 0);
        assertFalse(product.isInStock());
    }

    // getInventoryValue

    @Test
    void getInventoryValue_returnCorrectValue() {
        assertEquals(1700*4, product.getInventoryValue());
    }
}