package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotX {
    /*

    Given a string,
    compute recursively
    a new string where all the 'x' chars have been removed.

    noX("xaxb") , "ab"
    noX("abc") , "abc"
    noX("xx") , ""

     */

    public String noX(String str) {
        if (str.length() <= 1) {
            return str.equals("x") ? "" : str;
        }
        return noX(str.substring(0,1))+noX(str.substring(1));
    }

    @Test
    public void test() {
        assertEquals(noX("xaxb"), "ab");
        assertEquals(noX("abc"), "abc");
        assertEquals(noX("xx"), "");
    }
}
