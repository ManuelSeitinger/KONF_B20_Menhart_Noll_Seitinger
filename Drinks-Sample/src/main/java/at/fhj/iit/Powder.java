package at.fhj.iit;

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

    public String getName(){
        return name;
    }
    public double getAmount(){
        return amount;
    }
}
