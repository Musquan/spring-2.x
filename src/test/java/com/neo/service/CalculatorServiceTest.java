package com.neo.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    private final CalculatorService calculator = new CalculatorService();

    // ADDITION
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-15, calculator.add(-10, -5));
    }

    // SUBTRACTION
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testSubtractNegativeResult() {
        assertEquals(-5, calculator.subtract(5, 10));
    }

    // MULTIPLICATION
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(25, calculator.multiply(-5, -5));
    }


    // MODULO
    @Test
    public void testModuloValidInputs() {
        assertEquals(1, calculator.modulo(10, 3));
    }

    // MAX
    @Test
    public void testMax() {
        assertEquals(10, calculator.max(10, 5));
        assertEquals(10, calculator.max(5, 10));
    }

    // MIN
    @Test
    public void testMin() {
        assertEquals(5, calculator.min(10, 5));
        assertEquals(5, calculator.min(5, 10));
    }
}
