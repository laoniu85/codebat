package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonacci {


    /*

    The fibonacci sequence is
    a famous bit of mathematics,
    and it happens to have a recursive definition.
    The first two values in the sequence are
    0 and 1 (essentially 2 base cases).
    Each subsequent value is the sum of
    the previous two values,
    so the whole sequence is:
            0, 1, 1, 2, 3, 5, 8, 13, 21
    and so on. Define a recursive fibonacci(n)
    method that returns the nth fibonacci number,
    with n=0 representing the start of the sequence.

    fibonacci(0) → 0
    fibonacci(1) → 1
    fibonacci(2) → 1
    */
    public int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Test
    public void testFibonacci() {
        assertEquals(fibonacci(0), 0);
        assertEquals(fibonacci(1), 1);
        assertEquals(fibonacci(2), 1);
        assertEquals(fibonacci(3), 2);
        assertEquals(fibonacci(4), 3);
    }


}
