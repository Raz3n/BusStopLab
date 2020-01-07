import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    private Bus bus;
    private Person person;
    private Bus minibus;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 10);
        person = new Person();

    }

    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPersonToBus() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void hasCapacityForAnotherPassenger() {
        bus.addPassengerIfSpace(person);
        bus.addPassengerIfSpace(person);

        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void doesNotHaveCapacityForPassenger() {
        minibus = new Bus("Haymarket", 2);
        minibus.addPassengerIfSpace(person);
        minibus.addPassengerIfSpace(person);
        minibus.addPassengerIfSpace(person);

        assertEquals(2, minibus.passengerCount());

    }


}
