package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial {
    /*

        Given n of 1 or more, return the factorial of n,
         is n * (n-1) * (n-2) ... 1.
         Compute the result recursively (without loops).

        factorial(1) → 1
        factorial(2) → 2
        factorial(3) → 6
     */

    public int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n-1);
    }

    @Test
    public void testFactorial() {
        assertEquals(factorial(1), 1);
        assertEquals(factorial(2), 2);
        assertEquals(factorial(3), 6);
    }
}
