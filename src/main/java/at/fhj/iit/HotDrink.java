package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hot drink. The drink can be made using liquids and powders. The drink has a certain temperature.
 */
public class HotDrink extends Drink implements ICashRegister{

    private List<Liquid> liquids = new ArrayList<>();
    private double temperature;
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
     * @return Volume of the drink. Is calculated from the volume of all the liquids in the drink.
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for(Liquid l : liquids){
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Returns the price of the hot drink.
     * @return double price
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Returns the alcohol percent of the drink.
     * @return 0 Because a hot drink is never alcoholic.
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Returns a boolean if the drink is alcoholic.
     * @return false Because a hot drink is never alcoholic-
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

    /**
     * Gives information about the sale of a drink
     *
     * @param salesPerson name of the person who sells the drink
     * @param date date when the drink was sold
     * @return an array containing the information of the sale
     */
    @Override
    public String[] sell(String salesPerson, String date) {
        return new String[] {salesPerson, date, String.valueOf(price)};
    }
}
