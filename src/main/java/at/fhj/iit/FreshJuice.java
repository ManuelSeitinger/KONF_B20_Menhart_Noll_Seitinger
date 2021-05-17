package at.fhj.iit;

/**
 * represents a special liquid, which can be used by itself or mixed with other liquids
 */
public class FreshJuice extends Drink implements ICashRegister{

    /**
     * is defined by a certain liquid
     */
    private Liquid l;

    /**
     * Creates new liquid with given name, volume and
     * alcoholPercent
     *
     * @param name name of freshJuice
     * @param l type of liquid
     */
    public FreshJuice(String name,double price, Liquid l) {
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
     * juices are not alcoholic
     * @return alcoholPercentage (=0)
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * juices are not alcoholic
     * @return false (because freshJuices are non-alcoholic)
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    /**
     * method allows you to enjoy a juice
     * @return simulates drinking and returns string ("Glass is empty!")
     */
    public String toString() {
        double v = l.getVolume() * 1000;
        while (v > 0) {
            System.out.println("Drinks " + name + "juice: " + v + " milliliters left.");
            v -= 50;
        }
        return "Glass is empty!";
    }

    @Override
    public String[] sell(String salesPerson, String date) {
        String [] sell = {salesPerson, date, String.valueOf(price)};
        return sell;
    }
}
