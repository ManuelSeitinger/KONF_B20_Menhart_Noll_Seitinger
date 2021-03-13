package at.fhj.iit;

public class Powder {

    private String name;
    private double amount;

    public Powder(String name, double amount){
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
