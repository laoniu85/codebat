package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountX {

    /*
    Given a string,
    compute recursively (no loops)
    the number of lowercase 'x' chars in the string.
    countX("xxhixx") , 4
    countX("xhixhix") , 3
    countX("hi") , 0
     */
    public int countX(String str) {
        if (str.length() <= 1) {
            return str.equals("x") ? 1 : 0;
        }
        return countX(str.substring(0, 1)) + countX(str.substring(1, str.length()));
    }

    @Test
    public void testCountX() {
        assertEquals(countX("xxhixx"), 4);
        assertEquals(countX("xhixhix"), 3);
        assertEquals(countX("hi"), 0);
    }
}
