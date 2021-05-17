package at.fhj.iit;

/**
 * represents a simple drink liquid which can be used in drinks
 */
public class SimpleDrink extends Drink{

    /**
     * uses only one liquid
     */
    protected Liquid l;
    private double price;
    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only one liquid in drink, because it's a simple drink an not e.g. a cocktail
     */
    SimpleDrink(String name, double price,Liquid l){
        super(name,price);
        this.l = l;
    }

    /**
     * Returns volume of liquid l
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
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
        return new String[] {salesPerson,date,String.valueOf(price)};
    }

    public String toString(){
        return "Simple Drink called " + name + " with " + l.getAlcoholPercent() + " percent alcohol by volume";
    }
}
