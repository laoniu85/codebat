package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountIsNot {

    /*
     Given a string, return true if the number of appearances of "is"
     anywhere in the string is equal to the number of appearances
     of "not" anywhere in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
    */

    public int countWord(String str, String word) {
        int index = 0;
        int count = 0;
        while (str.indexOf(word, index) >= 0 &&
                index < str.length()) {
            index = str.indexOf(word, index) + word.length();
            count++;
        }
        return count;
    }

    public boolean equalIsNot(String str) {
        return countWord(str, "is") == countWord(str, "not");
    }

    @Test
    public void testCountWord() {
        //assertEquals(2, countWord("This is not", "is"));
        //assertEquals(1, countWord("This is not", "not"));
        //assertEquals(2, countWord("isisnotnot", "not"));
        assertEquals(2, countWord("isisnotnot", "is"));
    }

    @Test
    public void testEqualIsNot() {
        assertEquals(equalIsNot("This is not"), false);
        assertEquals(equalIsNot("This is notnot"), true);
        assertEquals(equalIsNot("noisxxnotyynotxisi"), true);
        assertEquals(equalIsNot("noisxxnotyynotxsi"), false);
        assertEquals(equalIsNot("xxxyyyzzzintint"), true);
        assertEquals(equalIsNot(""), true);
        assertEquals(equalIsNot("isisnotnot"), true);
        assertEquals(equalIsNot("isisnotno7Not"), false);
        assertEquals(equalIsNot("isnotis"), false);
        assertEquals(equalIsNot("mis3notpotbotis"), false);
    }

}
