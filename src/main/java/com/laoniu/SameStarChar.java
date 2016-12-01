package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yongliuli on 12/1/16.
 */
public class SameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*")) {
                if (!str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void testSameStartChar() {
        assertTrue(sameStarChar("xy*yzz"));
        assertFalse(sameStarChar("xy*zzz"));
        assertTrue(sameStarChar("*xa*az"));
    }
}
