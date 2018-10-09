import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before(){
        busStop = new BusStop("Princess Street");
        person = new Person();
    }

    @Test
    public void addPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
    }
    @Test
    public void removePersonFromQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueCount());
        busStop.removePersonFromQueue(person);
        assertEquals(0, busStop.queueCount());
    }


}
