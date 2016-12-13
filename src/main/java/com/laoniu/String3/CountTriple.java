package com.laoniu.String3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTriple {

    /*
        We'll say that a "triple" in a string
        is a char appearing three times in a row.
        Return the number of triples in the given string.
        The triples may overlap.

        countTriple("abcXXXabc") , 1
        countTriple("xxxabyyyycd") , 3
        countTriple("a") , 0
     */

    public int countTriple(String str) {
        return 1;
    }

    @Test
    public void testCountTripple() {
        assertEquals(countTriple("abcXXXabc"), 1);
        assertEquals(countTriple("xxxabyyyycd"), 3);
        assertEquals(countTriple("a"), 0);
        assertEquals(countTriple(""), 0);
        assertEquals(countTriple("XXXabc"), 1);
        assertEquals(countTriple("XXXXabc"), 2);
        assertEquals(countTriple("XXXXXabc"), 3);
        assertEquals(countTriple("222abyyycdXXX"), 3);
        assertEquals(countTriple("abYYYabXXXXXab"), 4);
        assertEquals(countTriple("abYYXabXXYXXab"), 0);
        assertEquals(countTriple("abYYXabXXYXXab"), 0);
        assertEquals(countTriple("122abhhh2"), 1);
    }
}
