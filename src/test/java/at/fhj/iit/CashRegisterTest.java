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
     * Before every test setup() is performed to ensure that the objects are not influenced from tests before.
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
     * Tests if calculateSalesOfNonAlcoholicDrink() returns the expected value. The method takes a list of objects from type Drink() and calculates the sum of the prices of drinks with
     * alcohol percentage 0. In this test scenario I know that there are 4 not alcoholic drinks in the list which each costs 20.0 the expected outcome from the method is 80.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesOfNonAlcoholicDrink")
    public void testCalculateSalesOfNonAlcoholicDrink(){
        assertEquals(80.0, cashRegister.calculateSalesOfNonAlcoholicDrink(drinks));
    }

    /**
     * Tests if the method calculateSalesOfMildAlcoholicDrink() returns the expected value. The method calculates the sum of the prices of all drinks in a list where the alcohol percentage is lower
     * then 16 and not 0. In the test list there are no such drinks so the expected outcome is 0.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesOfMildAlcoholicDrink")
    public void testCalculateSalesOfMildAlcoholicDrink(){
        assertEquals(0.0, cashRegister.calculateSalesOfMildAlcoholicDrink(drinks));
    }

    /**
     * Tests if the method calculateSalesOfStrongAlcoholicDrink() returns the expected value. The method calculates the sum of the prices of all drinks in a list with a alcohol percentage
     * higher then 16. There are 2 drinks in the list which both cost 20.0 so the expected outcome value is 40.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesOfStrongAlcoholicDrink")
    public void testCalculateSalesOfStrongAlcoholicDrink(){
        assertEquals(40.0, cashRegister.calculateSalesOfStrongAlcoholicDrink(drinks));
    }

    /**
     * Tests if the method calculateSalesPerDay() returns the expected value. The method calculates the sales of a given day using a list of sales. The list is from the type String[] in which
     * the name of the salesperson, the date of the trade and the name of the sold drink is given. As all trades in the test sales list were made on 17-05-2021 and there are 6 drinks sold each for 20.0
     * the expected outcome value is 120.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesPerDay")
    public void testCalculateSalesPerDay(){
        assertEquals(120.0, cashRegister.calculateSalesPerDay("17-05-2021", sales));
    }

    /**
     * Tests if the method calculateSalesOfPerson returns the expected value. The method takes a list of sales and the name of the salesperson and checks how many sales the given person made.
     * As every person in the test case made 2 sales for each 20.0 the expected outcome value is 40.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesOfPerson")
    public void testCalculateSalesOfPerson(){
        assertEquals(40.0, cashRegister.calculateSalesOfPerson(salesPerson2, sales));
    }

    /**
     * Tests if the method calculateSalesOfPersonPerDay() returns the expected value. The method takes the name of a salesperson, a date in form of a String and a list of sales. Then the method checks how
     * many sales the given salesperson made on the given date. As all salesperson made 2 trades each 20.0 on one day the expected outcome value is 40.0
     * @see CashRegister
     */
    @Test
    @DisplayName("testCalculateSalesOfPersonPerDay")
    public void testCalculateSalesOfPersonPerDay(){
        assertEquals(40.0, cashRegister.calculateSalesOfPersonPerDay(salesPerson3, "17-05-2021", sales));
    }
}
