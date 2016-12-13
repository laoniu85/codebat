package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GHappy {

    /*
        We'll say that a lowercase 'g' in
        a string is "happy" if there is another 'g'
        immediately to its left or right.
        Return true if all the g's in the given string are happy.

        gHappy("xxggxx") , true
        gHappy("xxgxx") , false
        gHappy("xxggyygxx") , false
    */
    public boolean isAfterg(String str, int index) {
        if (index - 1 >= 0) {
            return str.substring(index - 1, index).equals("g");
        }
        return false;
    }

    public boolean isBeforeg(String str, int index) {
        if (index + 1 < str.length()) {
            return str.substring(index + 1, index + 2).equals("g");
        }
        return false;
    }

    public boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("g")) {
                if(!isAfterg(str,i)&&!isBeforeg(str,i)){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void testGHappy() {

        assertEquals(gHappy("xxggxx"), true);
        assertEquals(gHappy("xxgxx"), false);
        assertEquals(gHappy("xxggyygxx"), false);
        assertEquals(gHappy("g"), false);
        assertEquals(gHappy("gg"), true);
        assertEquals(gHappy(""), true);
        assertEquals(gHappy("xxgggxyz"), true);
        assertEquals(gHappy("xxgggxyg"), false);
        assertEquals(gHappy("xxgggxygg"), true);
        assertEquals(gHappy("mgm"), false);
        assertEquals(gHappy("mggm"), true);
        assertEquals(gHappy("yyygggxyy"), true);
    }
}
