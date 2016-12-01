package com.laoniu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by yongliuli on 12/1/16.
 */
public class TestCodeBat {

    public boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        if (str.length() % 2 == 1) {
            return "xyz".equals(str.substring(str.length() / 2 - 1, str.length() / 2 + 2));
        }
        return "xyz".equals(str.substring(str.length() / 2 - 1, str.length() / 2 + 2))
                || "xyz".equals(str.substring(str.length() / 2 - 2, str.length() / 2 + 1));
    }


    public String getSandwich(String str) {
        int firstIndex=str.indexOf("bread");
        int lastIndex=str.lastIndexOf("bread");
        if(firstIndex==lastIndex){
            return "";
        }
        return str.substring(firstIndex+5,lastIndex);
    }

    @org.junit.Test
    public void testGetSandwich() {
        assertEquals(getSandwich("breadjambread"), "jam");
        assertEquals(getSandwich("xxbreadjambreadyy"), "jam");
        assertEquals(getSandwich("xxbreadyy"), "");
    }

    @org.junit.Test
    public void testXYmiddle() {
        assertTrue(xyzMiddle("xyzAxyzBBB"));
    }
}
