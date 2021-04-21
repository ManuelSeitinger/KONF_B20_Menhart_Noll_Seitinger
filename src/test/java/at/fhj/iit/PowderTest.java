package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the class Powder
 */
@DisplayName("Testing Powder Implementation")
public class PowderTest {

    private Powder powder;

    /**
     * Before every test a new powder object is generated
     */
    @BeforeEach
    public void setup(){
        powder = new Powder("Powder", 0.3);
    }

    /**
     * Tests if the method getName() returns the expected value
     */
    @Test
    @DisplayName("testGetName")
    public void testGetName(){
        assertEquals("Powder", powder.getName());
    }

    /**
     * Tests if the method getAmount() returns the expected value
     */
    @Test
    @DisplayName("testGetAmount")
    public void testGetAmount(){
        assertEquals(0.3, powder.getAmount());
    }
}
