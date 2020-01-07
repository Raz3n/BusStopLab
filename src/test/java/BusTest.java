import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    private Bus bus;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal");

    }

    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }
}
