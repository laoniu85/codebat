package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountHi {
    /*

    Given a string,
    compute recursively (no loops)
    the number of times lowercase "hi" appears in the string.

    countHi("xxhixx") , 1
    countHi("xhixhix") , 2
    countHi("hi") , 1
     */
    public int countHi(String str) {
        int index = str.indexOf("hi");
        return index >= 0 ? 1 + countHi(str.substring(index + 2)) : 0;
    }

    @Test
    public void testCountHi() {
        assertEquals(countHi("xxhixx"), 1);
        assertEquals(countHi("xhixhix"), 2);
        assertEquals(countHi("hi"), 1);

    }


}
