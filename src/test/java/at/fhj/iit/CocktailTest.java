package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Cocktail Implementation")
public class CocktailTest {

    private Cocktail cocktail;
    Liquid gin = new Liquid("Gin", 0.4, 37);
    Liquid tonicWater = new Liquid("Tonic Water", 0.25, 0);
    List<Liquid> ingredients = new ArrayList<>();


    @BeforeEach
    public void setup() {
        ingredients.add(gin);
        ingredients.add(tonicWater);
        cocktail = new Cocktail("GinTonic",ingredients);
    }

    @Test
    @DisplayName("testGetVolume")
    public void testGetVolume() {
        assertEquals(0.65, cocktail.getVolume());
    }

    @Test
    @DisplayName("testGetAlcoholPercent")
    public void testGetAlcoholPercent() {
        assertEquals(37, cocktail.getAlcoholPercent());
    }

    @Test
    @DisplayName("testIsAlcoholic")
    public void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }


    @Test
    @DisplayName("testToString")
    public void testToString(){
        assertEquals("The cocktail 'GinTonic' consists of:  'Gin' 'Tonic Water' and has a total percentage of: 37.0 per volume",cocktail.toString());
    }

}
