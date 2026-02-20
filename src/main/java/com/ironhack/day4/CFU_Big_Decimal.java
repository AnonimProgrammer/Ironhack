package com.ironhack.day4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CFU_Big_Decimal {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("2.3");
        BigDecimal num2 = new BigDecimal("1.5");

        BigDecimal sum = num1.add(num2);
        BigDecimal difference = num1.subtract(num2);
        BigDecimal product = num1.multiply(num2);
        BigDecimal division = num1.divide(num2, 2, RoundingMode.HALF_EVEN);

        BigDecimal x = BigDecimal.valueOf(1.1);

        BigDecimal firstPart = num1.multiply(x).add(num2);
        BigDecimal secondPart = x.subtract(BigDecimal.valueOf(0.8));

        BigDecimal result = firstPart.divide(secondPart, 3, RoundingMode.HALF_EVEN);
        System.out.println(result);
    }
}
