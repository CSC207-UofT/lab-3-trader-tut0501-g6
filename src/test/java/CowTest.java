/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow cow;

    @Before
    public void setUp() throws Exception {
        cow = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("MOOOO", cow.sound());
    }

    @Test(timeout = 50)
    public void TestGetKillable() {
        assertFalse(cow.isToKill());
    }

    @Test(timeout = 50)
    public void TestGetMilkable() {
        assertFalse(cow.isMilkable());
    }

}