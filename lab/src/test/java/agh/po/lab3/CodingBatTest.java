package agh.po.lab3;

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
}