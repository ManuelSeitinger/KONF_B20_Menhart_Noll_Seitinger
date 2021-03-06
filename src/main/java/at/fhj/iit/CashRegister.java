package at.fhj.iit;

import java.util.ArrayList;

public class CashRegister {

    /**
     * Calculates the sales of a drink, dependent on the content of alcohol. A strong alcoholic drink is defined as a drink,
     * which has a alcohol percentage higher than 16, a mild alcoholic drink is defined as a drink which has a alcohol percentage lower or equal
     * to 16. The alcohol percentage of a non-alcoholic drink equals 0.
     *
     * @param drinks List of all drinks which were sold
     * @return double [] with summarized sales, distinguished by alcohol percentage level
     */
    public double[] calculateSalesPerVolume(ArrayList<Drink> drinks){
        double sumNonAlcoholic = 0;
        double sumMildAlcoholic = 0;
        double sumStrongAlcoholic = 0;

        for(int i = 0;i<drinks.size();i++){
            if(drinks.get(i).getAlcoholPercent() == 0 ){
                sumNonAlcoholic += drinks.get(i).getPrice();
            }else if(drinks.get(i).getAlcoholPercent() <= 16){
                sumMildAlcoholic += drinks.get(i).getPrice();
            }else{
                sumStrongAlcoholic += drinks.get(i).getPrice();
            }
        }
        return new double[] {sumNonAlcoholic,sumMildAlcoholic,sumStrongAlcoholic};
    }

    /**
     * Calculates the sales of non alcohol drinks
     *
     * @param drinks List of all drinks which were sold
     * @return sum of sales
     */
    public double calculateSalesOfNonAlcoholicDrink(ArrayList<Drink> drinks){
        double sum = 0;
        for(int i = 0;i<drinks.size();i++){
            if(drinks.get(i).getAlcoholPercent() == 0){
                sum+=drinks.get(i).getPrice();
            }
        }
        return sum;
    }

    /**
     * Calculates the sales of mild alcohol drinks. A mild alcoholic drink is defined as a drink which has a alcohol percentage lower or equal to 16. A drink
     * with 0 percent alcohol is not mild alcoholic
     *
     * @param drinks List of all drinks which were sold
     * @return sum of sales
     */
    public double calculateSalesOfMildAlcoholicDrink(ArrayList<Drink> drinks){
        double sum = 0;
        for(int i = 0;i<drinks.size();i++){
            if((drinks.get(i).getAlcoholPercent() <= 16) && (drinks.get(i).getAlcoholPercent()!=0)){
                sum+=drinks.get(i).getPrice();
            }
        }
        return sum;
    }

    /**
     * Calculates the sales of strong alcohol drinks. A strong alcoholic drink is defined as a drink which has a alcohol percentage higher then 16
     *
     * @param drinks List of all drinks which were sold
     * @return sum of sales
     */
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
