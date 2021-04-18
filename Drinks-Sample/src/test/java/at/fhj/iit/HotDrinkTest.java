package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing HotDrink Implementation")
public class HotDrinkTest {

    private HotDrink hotDrink;
    Liquid milk = new Liquid("Milk", 0.125, 0);
    Liquid caramel = new Liquid("Caramel Sauce", 0.125, 0);
    Powder cacaoPowder = new Powder("Cacao Powder", 0.3);
    List<Liquid> liquidsInHotDrink = new ArrayList<>();
    List<Powder> powdersInHotDrink = new ArrayList<>();

    @BeforeEach
    public void setup (){
        liquidsInHotDrink.add(milk);
        liquidsInHotDrink.add(caramel);
        powdersInHotDrink.add(cacaoPowder);
        hotDrink = new HotDrink("Cacao", liquidsInHotDrink, 75, powdersInHotDrink);
    }

    @Test
    @DisplayName("testGetVolume")
    public void testGetVolume () {
        assertEquals(0, hotDrink.getVolume());
    }

    @Test
    @DisplayName("testGetAlcoholPercent")
    public void testGetAlcoholPercent () {
        assertEquals(0, hotDrink.getAlcoholPercent());
    }

    @Test
    @DisplayName("testIsAlcoholic")
    public void testIsAlcoholic () {
        assertFalse(hotDrink.isAlcoholic());
    }

    @Test
    @DisplayName("testMakeHotDrink")
    public void testMakeHotDrink () {
        assertEquals("Starting the oven\nMixing  'Milk' 'Caramel Sauce' with 'Cacao Powder'\nBring the temperature to 75.0 degrees celsius\nEnjoy your Cacao", hotDrink.makeHotDrink());
    }
}