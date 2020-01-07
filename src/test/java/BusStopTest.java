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

    @Test
    public void busStopIsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.queueCount());
    }

}
