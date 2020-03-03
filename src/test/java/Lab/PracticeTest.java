package Lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {

    @Test
    void doesStuff() {
      Practice practice = new Practice();
      assertEquals(6,practice.doesStuff(2,1));

    }

    @Test
    void throwStuff() {
        Practice practice = new Practice();
        assertThrows(Exception.class,practice::throwStuff);

        }

    @Test
    void checkstring() {
        Practice practice = new Practice();
        assertEquals("Hello",practice.checkstring("Hello"));
    }

    @Test
    void throwNewException() {
        Practice practice = new Practice();
        assertThrows(Exception.class,practice::throwNewException);
    }
}
