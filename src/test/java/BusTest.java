import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Ocean Terminal",4);
        person = new Person();
        busStop = new BusStop("Princess Street");
    }

    @Test
    public void passengerCount(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengers() {
        bus.addPassenger(person);
        assertEquals(1 , bus.passengerCount());
    }

    @Test
    public void removePassengers() {
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void pickUp() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
        bus.pickUp(busStop, person);
        assertEquals(0, busStop.queueCount());
        assertEquals(1, bus.passengerCount());
    }
}
