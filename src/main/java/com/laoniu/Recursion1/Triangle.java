package com.laoniu.Recursion1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Triangle {
    /*

        We have triangle made of blocks.
        The topmost row has 1 block,
        the next row down has 2 blocks,
        the next row has 3 blocks,
        and so on.
        Compute recursively
        (no loops or multiplication)
        the total number of blocks
        in such a triangle with the given number of rows.

        triangle(0) → 0
        triangle(1) → 1
        triangle(2) → 3

     */
    public int triangle(int rows) {
        return rows < 2 ? rows : rows + triangle(rows - 1);
    }


    @Test
    public void testTriangle() {
        assertEquals(triangle(0), 0);
        assertEquals(triangle(1), 1);
        assertEquals(triangle(2), 3);
        assertEquals(triangle(3), 6);
        assertEquals(triangle(4), 10);
        assertEquals(triangle(5), 15);
    }
}
