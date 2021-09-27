import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    Tank t;
    @Before
    public void setUp() throws Exception {
        t = new Tank(100000);
    }

    @Test(timeout = 50)
    public void TestPrice() {
        assertEquals(100000, t.getPrice());
    }
}