package org.mylearnings;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mylearnings.generics.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private static Calculator testCalculator;

    @BeforeClass
    public static void setUp() {
        testCalculator = new Calculator();
    }

    @Test
    public void addTwoIntegerNumbers() {
        assertEquals((Integer) 12, testCalculator.add(5, 7));
    }

    @AfterClass
    public static void tearDown() {
        testCalculator = null;
    }
}
