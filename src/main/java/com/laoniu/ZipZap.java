package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yongliuli on 12/1/16.
 */
public class ZipZap {
    public String zipZap(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                stringBuilder.append(str.substring(i, i + 1));
            } else {
                if (!(str.substring(i - 1, i).equals("z") &&
                        str.substring(i + 1, i + 2).equals("p"))) {
                    stringBuilder.append(str.substring(i, i + 1));
                }
            }
        }
        return stringBuilder.toString();
    }

    @Test
    public void testZipZap() {
        assertEquals(zipZap("zipXzap"), "zpXzp");
        assertEquals(zipZap("zopzop"), "zpzp");
        assertEquals(zipZap("zzzopzop"), "zzzpzp");
    }

}
