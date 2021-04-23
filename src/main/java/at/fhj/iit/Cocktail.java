package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink{

    /**
     * List which contains all of the liquids used for a cocktail
     */
    private List<Liquid> liquids = new ArrayList<>();

    /**
     * Constructor for creating a new cocktail object
     *
     * @param name name of the cocktail
     * @param liquids List of liquids which are the ingredients for the cocktail
     */
    public Cocktail(String name, List<Liquid> liquids){
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        return 0;
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
        return false;
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
}