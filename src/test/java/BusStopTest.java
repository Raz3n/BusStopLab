import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal", 10);;
        busStop = new BusStop("Elm Row");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Elm Row", busStop.getName());
    }

}
