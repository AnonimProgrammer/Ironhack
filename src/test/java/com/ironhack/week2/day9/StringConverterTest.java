package com.ironhack.week2.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConverterTest {

    @Test
    void convertToInt_returnsInteger() {
        assertEquals(11, StringConverter.convertToInt("11"));
    }

    @Test
    void convertToInt_invalidValue_returnsZero() {
        assertEquals(0, StringConverter.convertToInt("11.1"));
    }
}