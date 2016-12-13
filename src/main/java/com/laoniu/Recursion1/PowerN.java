package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerN {
    /*


        Given base and n that are both 1 or more,
        compute recursively (no loops)
        the value of base to the n power,
        so powerN(3, 2) is 9 (3 squared).

        powerN(3, 1) , 3
        powerN(3, 2) , 9
        powerN(3, 3) , 27
     */

    public int powerN(int base, int n) {
        return n == 0 ? 1 : base * powerN(base, n - 1);
    }

    @Test
    public void testPowerN() {
        assertEquals(powerN(3, 1), 3);
        assertEquals(powerN(3, 2), 9);
        assertEquals(powerN(3, 3), 27);

    }
}
