import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }

    public void addPassengerIfSpace(Person person) {
        if (this.passengerCount() < capacity) {
            this.addPassenger(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUpPassengerFromStop(BusStop busStop) {
        Person person = busStop.removePerson();
        this.addPassengerIfSpace(person);

    }
}
