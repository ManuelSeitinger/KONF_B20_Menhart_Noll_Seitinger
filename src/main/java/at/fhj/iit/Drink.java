package at.fhj.iit;

/**
 * Abstract base class for concrete drink classes
 */
public abstract class Drink {

    /**
     * name of the drink, so it's easier to identify drink
     */
    protected String name;
    protected double price;

    /**
     * Creates a Drink object with given name, e.g. juice or orange juice
     *
     * @param name name of the drink
     *
     */

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();

    /**
     *
     * @return the price of the string
     */
    public abstract double getPrice();

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();

    /**
     * Gives information about the sale of a drink
     *
     * @param salesPerson name of the person who sells the drink
     * @param date date when the drink was sold
     * @return an array containing the information of the sale
     */
    public abstract String[] sell(String salesPerson, String date);
}
