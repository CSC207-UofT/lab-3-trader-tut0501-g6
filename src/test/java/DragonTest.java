import org.junit.*;

import static org.junit.Assert.*;

public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon(true, 50);
    }

    @Test
    public void TestSound() {
        assertEquals("ICE BALL!!!!!!!!!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(101, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(99, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, d.getPrice());
    }
}