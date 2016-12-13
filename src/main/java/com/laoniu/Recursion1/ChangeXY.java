package com.laoniu.Recursion1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeXY {
    /*

    Given a string,
    compute recursively (no loops)
     a new string where all the lowercase 'x'
     chars have been changed to 'y' chars.

    changeXY("codex") , "codey"
    changeXY("xxhixx") , "yyhiyy"
    changeXY("xhixhix") , "yhiyhiy"

     */

    public String changeXY(String str) {
        if (str.length() <= 1) {
            return str.equals("x") ? "y" : str;
        }
        return changeXY(str.substring(0, 1)) + changeXY(right(str));
    }

    private String right(String str) {
        return str.substring(1, str.length());
    }

    @Test
    public void testChangeXY() {
        assertEquals(changeXY("codex"), "codey");
        assertEquals(changeXY("xxhixx"), "yyhiyy");
        assertEquals(changeXY("xhixhix"), "yhiyhiy");
    }


}
