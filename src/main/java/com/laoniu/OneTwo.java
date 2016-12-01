package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yongliuli on 12/1/16.
 */
public class OneTwo {
    public String oneTwo(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i+=3){
            if((str.length() - i) >=3){
                sb.append(str.substring(i+1,i+3));
                sb.append(str.substring(i,i+1));
            }
        }
        return sb.toString();
    }

    @Test
    public void testOneTwo() {
        assertEquals(oneTwo("abc"), "bca");
        assertEquals(oneTwo("tca"), "cat");
        assertEquals(oneTwo("tcagdo"), "catdog");

    }
}
