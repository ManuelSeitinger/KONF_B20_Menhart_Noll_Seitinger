package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hot drink. The drink can be made using liquids and powders. The drink has a certain temperature.
 */
public class HotDrink extends Drink{

    private List<Liquid> liquids = new ArrayList<>();
    private double temperature;
    private double price;
    private List<Powder> powders = new ArrayList<>();

    /**
     *
     * @param name name of the hot beverage
     * @param liquids List of liquids used in the hot beverage
     * @param temperature Temperature of the hot drink
     * @param powders List of powders used in the hot drink
     */
    public HotDrink(String name, double price ,List<Liquid> liquids, double temperature, List<Powder> powders){
        //Constructor for a hot drink
        super(name,price);
        this.liquids = liquids;
        this.temperature=temperature;
        this.powders= powders;
    }

    /**
     * Returns the volume of the drink.
     * @return 0
     */
    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Returns the alcohol percent of the drink.
     * @return 0
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Returns a boolean if the drink is alcoholic.
     * @return false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    /**
     * The method returns the stages of making the drink in the form of a string.
     * @return stages to make the drink
     */
    public String makeHotDrink(){
        String liquidsInHotDrink = "";
        String powdersInHotDrink = "";
        for(Liquid l : liquids){
            liquidsInHotDrink += " '"+l.getName()+"'";
        }
        for(Powder p : powders){
            powdersInHotDrink += " '"+p.getName()+"'";
        }
        return "Starting the oven\nMixing "+liquidsInHotDrink+" with"+powdersInHotDrink+"\nBring the temperature to "+temperature+" degrees celsius\nEnjoy your "+name;
    }
}
