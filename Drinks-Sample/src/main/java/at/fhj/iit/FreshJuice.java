package at.fhj.iit;

public class FreshJuice extends Drink{

    private Liquid l;

    public FreshJuice(String name, Liquid l) {
        super(name);
        this.l=l;
    }

    @Override
    public double getVolume() {
        return l.getVolume();
    }

    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }

    public String toString() {
        double v = l.getVolume() * 1000;
        while(v > 0) {
            System.out.println("Drinks " + name + "juice: " + v + " milliliters left.");
            v-=50;
        }
        return "Glass is empty!";
    }
}
