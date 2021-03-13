package at.fhj.iit;

/**
 * represents a special liquid, which can be used by itself or mixed with other liquids
 */
public class FreshJuice extends Drink {

    private Liquid l;

    public FreshJuice(String name, Liquid l) {
        super(name);
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
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * juices are not alcoholic
     * @return false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }

    /**
     * method allows you to enjoy a juice
     * @return
     */
    public String toString() {
        double v = l.getVolume() * 1000;
        while (v > 0) {
            System.out.println("Drinks " + name + "juice: " + v + " milliliters left.");
            v -= 50;
        }
        return "Glass is empty!";
    }
}
