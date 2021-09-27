/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class RacecarTest {
    Racecar fast;

    @Before
    public void setUp() throws Exception {
        fast = new Racecar();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(352, fast.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        fast.upgradeSpeed();
        assertEquals(353, fast.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        fast.downgradeSpeed();
        assertEquals(351, fast.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100000, fast.getPrice());
    }

}