package com.ironhack.week1.day4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Big_Decimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(".7");
        BigDecimal b = new BigDecimal(".1");
        BigDecimal sum = a.add(b);
        System.out.println(sum.setScale(2, RoundingMode.HALF_EVEN));

        BigDecimal totalAmount = new BigDecimal("10.5");
        int quantity = 3;
        BigDecimal price = totalAmount.divide(new BigDecimal(quantity), 2, RoundingMode.HALF_EVEN);
        System.out.println(price);
    }
}
