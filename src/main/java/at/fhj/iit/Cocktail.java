package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink implements ICashRegister{

    /**
     * List which contains all of the liquids used for a cocktail
     */
    private List<Liquid> liquids = new ArrayList<>();
    private double price;

    /**
     * Constructor for creating a new cocktail object
     *
     * @param name name of the cocktail
     * @param liquids List of liquids which are the ingredients for the cocktail
     */
    public Cocktail(String name, double price ,List<Liquid> liquids){
        super(name,price);
        this.liquids = liquids;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for(Liquid l : liquids){
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Returns the total amount of percentage of a cocktail
     *
     * @return total alcohol percentage of all included liquids
     */
    @Override
    public double getAlcoholPercent() {
        double percentage = 0;
        for (Liquid l : liquids){
            percentage += l.getAlcoholPercent();
        }
        return percentage;
    }

    /**
     * Returns if the cocktail is alcoholic
     *
     * @return false
     */
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    /**
     * Prints the information of the cocktail
     *
     * @return a String displaying the information of a cocktail
     */

    @Override
    public String toString() {
        String liquidsOfCocktail = "";
        for(Liquid l : liquids){
            liquidsOfCocktail += " '"+l.getName()+"'";
        }

        return "The cocktail '" + name + "' consists of: " + liquidsOfCocktail +
                " and has a total percentage of: " + getAlcoholPercent()+" per volume";
    }

    @Override
    public String[] sell(String salesPerson, String datum) {
        String[] sell = new String[3];
        sell[0] = salesPerson;
        sell[1] = datum;
        sell[2] = String.valueOf(price);

        return sell;
    }
}
