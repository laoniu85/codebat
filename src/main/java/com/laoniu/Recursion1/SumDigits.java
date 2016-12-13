package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDigits {
    /*

        Given a non-negative int n,
        return the sum of its digits recursively (no loops).
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        sumDigits(126) , 9
        sumDigits(49) , 13
        sumDigits(12) , 3
    */

    public int sumDigits(int n) {
        return n < 10 ? n : (n % 10) + sumDigits(n / 10);
    }

    @Test
    public void test() {
        assertEquals(sumDigits(126), 9);
        assertEquals(sumDigits(49), 13);
        assertEquals(sumDigits(12), 3);
    }
}
