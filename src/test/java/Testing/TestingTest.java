package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {
     Testing testing = new Testing();
    @Test
    void testAdd(){
        assertEquals(42,testing.Add(19,23));
    }
}