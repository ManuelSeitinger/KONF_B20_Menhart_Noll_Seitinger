package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the class CashRegistration
 */
@DisplayName("Testing CashRegistration Implementation")
public class CashRegisterTest {

    Liquid gin = new Liquid("Gin",0.4,37);
    Liquid tonicWater = new Liquid("Tonic Water",0.25,0);
    Liquid juice = new Liquid("Juice", 0.25, 0);
    Liquid milk = new Liquid("Milk", 0.125, 0);
    Liquid caramel = new Liquid("Caramel Sauce", 0.125, 0);
    Powder cacaoPowder = new Powder("Cacao Powder", 0.3);
    List<Liquid> liquids = new ArrayList<>();
    List<Liquid> liquidsInHotDrink = new ArrayList<>();
    List<Powder> powdersInHotDrink = new ArrayList<>();
    ArrayList<Drink> drinks = new ArrayList<>();
    ArrayList<String[]> sales = new ArrayList<>();
    String salesPerson1 = "Manuel";
    String salesPerson2 = "Helmut";
    String salesPerson3 = "Simon";
    CashRegister cashRegister;

    /**
     * Before every test setup() is performed.
     */
    @BeforeEach
    public void setup(){
        liquids.add(gin);
        liquids.add(tonicWater);
        liquidsInHotDrink.add(milk);
        liquidsInHotDrink.add(caramel);
        powdersInHotDrink.add(cacaoPowder);
        Drink cocktail1 = new Cocktail("Caipirinha", 20.0, liquids);
        Drink cocktail2 = new Cocktail("Caipirinha", 20.0, liquids);
        Drink freshJuice1 = new FreshJuice("Strawberry", 20.0, juice);
        Drink freshJuice2 = new FreshJuice("Strawberry", 20.0, juice);
        Drink hotDrink1 = new HotDrink("Cacao", 20.0, liquidsInHotDrink, 75, powdersInHotDrink);
        Drink hotDrink2 = new HotDrink("Cacao", 20.0, liquidsInHotDrink, 75, powdersInHotDrink);
        drinks.add(cocktail1);
        drinks.add(cocktail2);
        drinks.add(freshJuice1);
        drinks.add(freshJuice2);
        drinks.add(hotDrink1);
        drinks.add(hotDrink2);
        sales.add(cocktail1.sell(salesPerson1, "17-05-2021"));
        sales.add(cocktail2.sell(salesPerson1, "17-05-2021"));
        sales.add(freshJuice1.sell(salesPerson2, "17-05-2021"));
        sales.add(freshJuice2.sell(salesPerson2, "17-05-2021"));
        sales.add(hotDrink1.sell(salesPerson3, "17-05-2021"));
        sales.add(hotDrink2.sell(salesPerson3, "17-05-2021"));
        cashRegister = new CashRegister();
    }

    /**
     * Tests if calculateSalesOfNonAlcoholicDrink() returns the expected value.
     */
    @Test
    @DisplayName("testCalculateSalesOfNonAlcoholicDrink")
    public void testCalculateSalesOfNonAlcoholicDrink(){
        assertEquals(80.0, cashRegister.calculateSalesOfNonAlcoholicDrink(drinks));
    }

    @Test
    @DisplayName("testCalculateSalesOfMildAlcoholicDrink")
    public void testCalculateSalesOfMildAlcoholicDrink(){
        assertEquals(0.0, cashRegister.calculateSalesOfMildAlcoholicDrink(drinks));
    }

    @Test
    @DisplayName("testCalculateSalesOfStrongAlcoholicDrink")
    public void testCalculateSalesOfStrongAlcoholicDrink(){
        assertEquals(40.0, cashRegister.calculateSalesOfStrongAlcoholicDrink(drinks));
    }

    @Test
    @DisplayName("testCalculateSalesPerDay")
    public void testCalculateSalesPerDay(){
        assertEquals(120.0, cashRegister.calculateSalesPerDay("17-05-2021", sales));
    }

    @Test
    @DisplayName("testCalculateSalesOfPerson")
    public void testCalculateSalesOfPerson(){
        assertEquals(40.0, cashRegister.calculateSalesOfPerson(salesPerson2, sales));
    }

    @Test
    @DisplayName("testCalculateSalesOfPersonPerDay")
    public void testCalculateSalesOfPersonPerDay(){
        assertEquals(40.0, cashRegister.calculateSalesOfPersonPerDay(salesPerson3, "17-05-2021", sales));
    }
}
