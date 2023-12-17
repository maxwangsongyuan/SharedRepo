import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time time;

    @BeforeEach
    void setUp() {
        time = new Time(1, 2, 3);
    }

    @Test
    void getHour() {
        assertEquals(1, time.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(2, time.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(3, time.getSecond());
    }
}