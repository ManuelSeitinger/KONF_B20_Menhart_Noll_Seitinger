package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {
    private Drink sut;
    Liquid l = new Liquid("Wein", 0.250, 12.5);

    /**
     * inits with SimpleDrink for each test
     */
    @BeforeEach
    void setup(){ sut = new SimpleDrink("Weißwein", 20.0,l);  }

    /**
     * tests if simpleDrink returns expected volume value
     */
    @ParameterizedTest
    @ValueSource(doubles = {0.125, 0.02, 0.250, 0.500, 1.00})
    @DisplayName("testGetVolume")
    public  void testGetVolume (double doubles) {
        l.setVolume(doubles);
        assertEquals(doubles, sut.getVolume(), 0.0001);
    }

    /**
     * tests if simpleDrink returns expected alcohol value
     */
    @Test
    @DisplayName("testGetAlcoholPercent")
    public  void testGetAlcoholPercent () {
        assertEquals(12.5, sut.getAlcoholPercent(), 0.0001);
    }

    /**
     * tests if simpleDrink returns expected boolean
     */
    @Test
    @DisplayName("testIsAlcoholic")
    public  void testIsAlcoholic () {
        assertTrue(sut.isAlcoholic());
    l.setAlcoholPercent(0.0);
    assertFalse(sut.isAlcoholic());
    }


    /**
     * tests if simpleDrink returns expected string
     */
    @Test
    @DisplayName("testToString")
    public  void testToString () {
        assertEquals("Simple Drink called " + sut.name + " with " + l.getAlcoholPercent() + " percent alcohol by volume", sut.toString());

    }

}