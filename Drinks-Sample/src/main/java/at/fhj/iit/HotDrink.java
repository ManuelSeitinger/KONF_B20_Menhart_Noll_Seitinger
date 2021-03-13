package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class HotDrink extends Drink{

    private List<Liquid> liquids = new ArrayList<>();
    private double temperature;
    private List<Powder> powders = new ArrayList<>();

    public HotDrink(String name, List<Liquid> liquids, double temperature, List<Powder> powders){
        super(name);
        this.liquids = liquids;
        this.temperature=temperature;
        this.powders= powders;
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
    public void makeHotDrink(){
        String liquidsInHotDrink = "";
        String powdersInHotDrink = "";
        for(Liquid l : liquids){
            liquidsInHotDrink += " '"+l.getName()+"'";
        }
        for(Powder p : powders){
            powdersInHotDrink += " '"+p.getName()+"'";
        }
        System.out.printf("Starting the oven\nMixing "+liquidsInHotDrink+" with"+powdersInHotDrink+"\nBring the temperature to "+temperature+" degrees celsius\nEnjoy your "+name);
    }
}
