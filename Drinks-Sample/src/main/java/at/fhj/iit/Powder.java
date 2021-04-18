package at.fhj.iit;

/**
 * Represents a powder that can be used in drinks.
 */
public class Powder {

    private String name;
    private double amount;

    /**
     *
     * @param name name of the powder
     * @param amount Amount of the powder
     */
    public Powder(String name, double amount){
        //Constructor for the powder
        this.name=name;
        this.amount=amount;
    }

    /**
     * Returns the name of the powder.
     * @return name The name of the powder.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the amount of the powder used in a drink.
     * @return amount The amount of powder. 
     */
    public double getAmount(){
        return amount;
    }
}
