package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Count7 {
    /*
    Given a non-negative int n,
    return the count of the occurrences of 7 as a digit,
    so for example 717 yields 2. (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
    while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    count7(717) , 2
    count7(7) , 1
    count7(123) , 0
    */
    public int count7(int n) {
        if (n < 10)
            return n == 7 ? 1 : 0;
        return count7(n / 10) + (n % 10 == 7 ? 1 : 0);
    }

    @Test
    public void testCount7() {
        assertEquals(count7(717), 2);
        assertEquals(count7(7), 1);
        assertEquals(count7(123), 0);
    }
}
