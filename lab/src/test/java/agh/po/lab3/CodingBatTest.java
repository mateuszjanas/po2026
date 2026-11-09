package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void hasTeen() {
        assertEquals(true, CodingBat.hasTeen(13,15,16));
        assertEquals(false, CodingBat.hasTeen(1,5,6));
        assertEquals(false, CodingBat.hasTeen(26,29,100));
    }

    @org.junit.Test
    public void loneTeen() {
        assertEquals(true, CodingBat.loneTeen(12,15));
        assertEquals(false, CodingBat.loneTeen(13,13));
        assertEquals(false, CodingBat.loneTeen(10,1));
    }

    @org.junit.Test
    public void countEvens() {
        assertEquals(2, CodingBat.countEvens(new int[]{1,2,3,4,7,9,2137}));
        assertEquals(3, CodingBat.countEvens(new int[]{2,3,4,7,9,2130}));
        assertEquals(0, CodingBat.countEvens(new int[]{1,3,7,9,2137}));
    }

    @org.junit.Test
    public void helloName() {
        assertEquals("Hello jack!", CodingBat.helloName("jack"));
        assertEquals("Hello a!", CodingBat.helloName("a"));
        assertEquals("Hello b!", CodingBat.helloName("b"));
    }
    @org.junit.Test
    public void mapAB() {
        Map<String, String> input1 = new HashMap<>();
        input1.put("a", "Hi");
        input1.put("b", "There");
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "Hi");
        expected1.put("ab", "HiThere");
        expected1.put("b", "There");
        assertEquals(expected1, CodingBat.mapAB(input1));

        Map<String, String> input2 = new HashMap<>();
        input2.put("a", "Hi");
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "Hi");
        assertEquals(expected2, CodingBat.mapAB(input2));

        Map<String, String> input3 = new HashMap<>();
        input3.put("b", "There");
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("b", "There");
        assertEquals(expected3, CodingBat.mapAB(input3));
    }

    @org.junit.Test
    public void wordLen() {
        String[] input1 = {"a", "bb", "a", "bb"};
        Map<String, Integer> expected1 = new HashMap<>();
        expected1.put("bb", 2);
        expected1.put("a", 1);
        assertEquals(expected1, CodingBat.wordLen(input1));

        String[] input2 = {"this", "and", "that", "and"};
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("that", 4);
        expected2.put("and", 3);
        expected2.put("this", 4);
        assertEquals(expected2, CodingBat.wordLen(input2));

        String[] input3 = {"code", "code", "code", "bug"};
        Map<String, Integer> expected3 = new HashMap<>();
        expected3.put("code", 4);
        expected3.put("bug", 3);
        assertEquals(expected3, CodingBat.wordLen(input3));
    }

}