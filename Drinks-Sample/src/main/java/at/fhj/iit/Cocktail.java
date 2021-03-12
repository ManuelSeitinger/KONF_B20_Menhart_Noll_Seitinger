package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink{

    private List<Liquid> liquids = new ArrayList<>();

    /**
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

    @Override
    public boolean isAlcoholic() {
        return false;
    }

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
