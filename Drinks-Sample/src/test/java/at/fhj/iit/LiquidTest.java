package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testing Liquid Implementation")
public class LiquidTest {

    private Liquid liquid;

    /**
     * inits with Liquids for each test
     */
    @BeforeEach
    void setup(){ liquid = new Liquid("Wein",0.250,12.5);  }

    /**
     * tests if method getName() returns expected name
     */
    @Test
    @DisplayName("testGetName")
    public  void testGetName () {
        assertEquals("Wein", liquid.getName());
    }

    /**
     * tests if method getVolume() returns expected volume
     */
    @Test
    @DisplayName("testGetVolume")
    public  void testGetVolume () { assertEquals(0.250, liquid.getVolume()); }

    /**
     * tests if method getAlcoholPercent() returns expected percentage
     */
    @Test
    @DisplayName("testGetAlcoholPercent")
    public  void testGetAlcoholPercent () { assertEquals(12.5, liquid.getAlcoholPercent()); }



}
