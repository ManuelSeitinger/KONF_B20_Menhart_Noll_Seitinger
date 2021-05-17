package at.fhj.iit;

import java.util.ArrayList;

public class CashRegister {


    public double calculateSalesOfNonAlcoholicDrink(ArrayList<Drink> drinks){
        double sum = 0;
        for(int i = 0;i<drinks.size();i++){
            if(drinks.get(i).getAlcoholPercent() == 0){
                sum+=drinks.get(i).getPrice();
            }
        }
        return sum;
    }

    public double calculateSalesOfMildAlcoholicDrink(ArrayList<Drink> drinks){
        double sum = 0;
        for(int i = 0;i<drinks.size();i++){
            if(drinks.get(i).getAlcoholPercent() <= 16){
                sum+=drinks.get(i).getPrice();
            }
        }
        return sum;
    }

    public double calculateSalesOfStrongAlcoholicDrink(ArrayList<Drink> drinks){
        double sum = 0;
        for(int i = 0;i<drinks.size();i++){
            if(drinks.get(i).getAlcoholPercent() > 16){
                sum+=drinks.get(i).getPrice();
            }
        }
        return sum;
    }


    /**
     *  Calculates the sales of a certain day
     *
     * @param day day when the drink was sold
     * @param sales List of all sales
     * @return sum of sales
     */
    public double calculateSalesPerDay(String day, ArrayList<String[]> sales){
        double sum = 0;
        String[][] salesOfPerson = sales.toArray(new String [][]{});
        for(int i = 0;i<salesOfPerson.length;i++){
            if(salesOfPerson[i][1].contains(day)){
                sum+=Double.parseDouble(salesOfPerson[i][2]);
            }
        }
        return sum;
    }


    /**
     * Method to calculate the sales of a person
     *
     * @param salesPerson person which sold the drink
     * @param sales List of all sales
     * @return sum of sales
     */
    public double calculateSalesOfPerson(String salesPerson, ArrayList<String[]> sales){
        double sum = 0;
        String[][] salesOfPerson = sales.toArray(new String [][]{});
        for(int i = 0;i<salesOfPerson.length;i++){
            if(salesOfPerson[i][0].contains(salesPerson)){
                sum+=Double.parseDouble(salesOfPerson[i][2]);
            }
        }
        return sum;
    }

    /**
     * Calculates the sales of person on a specific day
     *
     * @param salesPerson name of the person which sold the drink
     * @param day day when the drink was sold
     * @param sales List of all sales
     * @return sum of sales
     */
    public double calculateSalesOfPersonPerDay(String salesPerson, String day, ArrayList<String[]> sales){
        double sum = 0;
        String[][] salesOfPerson = sales.toArray(new String [][]{});
        for(int i = 0;i<salesOfPerson.length;i++){
            if(salesOfPerson[i][0].contains(salesPerson) && salesOfPerson[i][1].contains(day)){
                sum+=Double.parseDouble(salesOfPerson[i][2]);
            }
        }
        return sum;
    }


}
