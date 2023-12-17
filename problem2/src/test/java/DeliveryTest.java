import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    private Delivery delivery;

    @BeforeEach
    void setUp() {
        Time startTime = new Time(1, 2, 0);
        Time endTime = new Time(1, 15, 45);
        delivery = new Delivery("x", "y", startTime, endTime);
    }

    @Test
    void getStartLocation() {
        assertEquals("x", delivery.getStartLocation());
    }

    @Test
    void getEndLocation() {
        assertEquals("y", delivery.getEndLocation());
    }

    @Test
    void getStartTime() {
        assertEquals(1, delivery.getStartTime().getHour());
        assertEquals(2, delivery.getStartTime().getMinute());
        assertEquals(0, delivery.getStartTime().getSecond());
    }

    @Test
    void getEndTime() {
        assertEquals(1, delivery.getEndTime().getHour());
        assertEquals(15, delivery.getEndTime().getMinute());
        assertEquals(45, delivery.getEndTime().getSecond());
    }

    @Test
    void getDuration() {
        Time duration = delivery.getDuration();
        assertEquals(0, duration.getHour());
        assertEquals(13, duration.getMinute());
        assertEquals(45, duration.getSecond());
    }
}