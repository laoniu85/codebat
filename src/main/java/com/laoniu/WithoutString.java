package com.laoniu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutString {




    public String withoutString(String base, String remove) {
        String ret1=withOutString1(base, remove);
        String[] splited = ret1.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splited.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(splited[i]);
        }
        return sb.toString();
    }

    private String withOutString1(String base, String remove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < base.length(); ) {
            if (base.length() - i >= remove.length()) {
                if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                    i += remove.length();
                    continue;
                }
            }
            sb.append(base.substring(i, i + 1));
            i = i + 1;
        }
        return sb.toString();
    }

    @Test
    public void testWithoutString() {
        assertEquals(withoutString("Hello there", "llo"), "He there");
        assertEquals(withoutString("Hello there", "e"), "Hllo thr");
        assertEquals(withoutString("Hello there", "x"), "Hello there");
        assertEquals(withoutString("This is a FISH", "IS"), "Th a FH");
        assertEquals(withoutString("THIS is a FISH", "is"), "TH a FH");
        assertEquals(withoutString("THIS is a FISH", "iS"), "TH a FH");
        assertEquals(withoutString("abxxxxab", "xx"), "abab");
        assertEquals(withoutString("abxxxab", "xx"), "abxab");
        assertEquals(withoutString("abxxxab", "x"), "abab");
        assertEquals(withoutString("xxx", "x"), "");
        assertEquals(withoutString("xxx", "xx"), "x");
        assertEquals(withoutString("xyzzy", "Y"), "xzz");
        assertEquals(withoutString("", "x"), "");
        assertEquals(withoutString("abcabc", "b"), "acac");
        assertEquals(withoutString("AA22bb", "2"), "AAbb");
        assertEquals(withoutString("1111", "1"), "");
        assertEquals(withoutString("1111", "11"), "");
        assertEquals(withoutString("MkjtMkx", "Mk"), "jtx");

    }

    @Test
    public void testWithoutString2() {
        assertEquals(withoutString("Hi HoHo", "Ho"), "Hi");
    }

}
