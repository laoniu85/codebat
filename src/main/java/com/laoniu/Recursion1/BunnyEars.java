package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunnyEars {
    /*

        We have a number of bunnies
        and each bunny has two big floppy ears.
        We want to compute the total number of ears
        across all the bunnies recursively
        (without loops or multiplication).

        bunnyEars(0) → 0
        bunnyEars(1) → 2
        bunnyEars(2) → 4
    */
    public int bunnyEars(int bunnies) {
        return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies-1);
    }

    @Test
    public void testBunnyEars(){
        assertEquals(bunnyEars(0),0);
        assertEquals(bunnyEars(1),2);
        assertEquals(bunnyEars(2),4);
    }
}
