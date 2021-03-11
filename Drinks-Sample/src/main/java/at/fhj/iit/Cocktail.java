package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Drink{

    private List<Liquid> liquids = new ArrayList<>();

    public Cocktail(String name, List<Liquid> liquids){
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
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

        return "The cocktail '" + name + "' consists of: " + liquidsOfCocktail;
    }
}
