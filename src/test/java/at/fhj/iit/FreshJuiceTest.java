package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing FreshJuice implementation")
public class FreshJuiceTest {
    private Drink sut;
    Liquid juice = new Liquid("Juice", 0.25, 0);

    /**
     * inits with FreshJuice for each test
     */
    @BeforeEach
    void setup(){ sut = new FreshJuice("Orange", juice);  }

    /**
     * tests if freshJuice returns expected volume value
     */
    @Test
    @DisplayName("testGetVolume")
    public  void testGetVolume () {
        assertEquals(0.25, sut.getVolume());
    }

    /**
     * tests if freshJuice returns expected alcohol value
     */
    @Test
    @DisplayName("testGetAlcoholPercent")
    public  void testGetAlcoholPercent () {
        assertEquals(0.0, sut.getAlcoholPercent(), 0.0001);
    }

    /**
     * tests if freshJuice returns expected boolean
     */
    @Test
    @DisplayName("testIsAlcoholic")
    public  void testIsAlcoholic () {
        assertFalse(sut.isAlcoholic());

    }

    /**
     * tests if freshJuice returns expected string
     */
    @Test
    @DisplayName("testToString")
    public  void testToString () {
        assertEquals("Glass is empty!", sut.toString());

    }

}
