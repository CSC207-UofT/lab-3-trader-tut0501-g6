import org.junit.*;

import static org.junit.Assert.*;

class TankTest {
    Tank t;
    @Before
    public void setUp() throws Exception {
        t = new Tank(100000);
    }

    @Test(timeout = 10)
    public void TestPrice() {
        assertEquals(100000, t.getPrice());
    }
}