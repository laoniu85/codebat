package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountYZ {
    public int countYZ(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){

            if(isYZ(str, i)){
                if(i==str.length()-1){
                    count++;
                }else{
                    if(!Character.isAlphabetic(str.charAt(i+1))){
                        count++;
                    }
                }

            }
        }
        return count;

    }

    private boolean isYZ(String str, int i) {
        return str.charAt(i)=='y'||
                str.charAt(i)=='Y'||
                str.charAt(i)=='z'||
                str.charAt(i)=='Z';
    }

    @Test
    public void testCountYZ() {
        assertEquals(countYZ("fez day"), 2);
        assertEquals(countYZ("day fez"), 2);
        assertEquals(countYZ("day fyyyz"), 2);
        assertEquals(countYZ("day yak"), 1);
        assertEquals(countYZ("day:yak"), 1);
        assertEquals(countYZ("!!day--yaz!!"), 2);
        assertEquals(countYZ("yak zak"), 0);
        assertEquals(countYZ("DAY abc XYZ"), 2);
        assertEquals(countYZ("aaz yyz my"), 3);
        assertEquals(countYZ("y2bz"), 2);
        assertEquals(countYZ("zxyx"), 0);
    }
}
