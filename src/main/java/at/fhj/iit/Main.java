package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid gin = new Liquid("Gin",0.4,37);
        Liquid tonicWater = new Liquid("Tonic Water",0.25,0);
        Liquid juice = new Liquid("Juice", 0.25, 0);
        Liquid milk = new Liquid("Milk", 0.125, 0);
        Liquid caramel = new Liquid("Caramel Sauce", 0.125, 0);
        Powder cacaoPowder = new Powder("Cacao Powder", 0.3);

        List<Liquid> liquids = new ArrayList<>();
        liquids.add(gin);
        liquids.add(tonicWater);

        List<Liquid> liquidsInHotDrink = new ArrayList<>();
        liquidsInHotDrink.add(milk);
        liquidsInHotDrink.add(caramel);

        List<Powder> powdersInHotDrink = new ArrayList<>();
        powdersInHotDrink.add(cacaoPowder);

        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",20.0,l);
        System.out.println(d);

        Drink caipirinha = new Cocktail("Caipirinha",20.0,liquids);
        System.out.println(caipirinha);

        Drink strawberryJuice = new FreshJuice("Strawberry", 20.0,juice);
        System.out.println(strawberryJuice);

        Drink cacao2 = new HotDrink("Cacao", 20.0 ,liquidsInHotDrink, 75, powdersInHotDrink);

        HotDrink cacao = new HotDrink("Cacao", 20.0 ,liquidsInHotDrink, 75, powdersInHotDrink);
        String makingProcess = cacao.makeHotDrink();
        System.out.println(makingProcess);

        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(caipirinha);
        drinks.add(strawberryJuice);
        drinks.add(cacao2);

        ArrayList<String[]> sales = new ArrayList<>();
        String[] cacaoSell = cacao.sell("Simon","17-05-2021");
        String[] strawJuiceSell = strawberryJuice.sell("Helmut","17-05-2021");
        String[] caipSell = caipirinha.sell("Manuel","17-05-2021");
        sales.add(cacaoSell);
        sales.add(cacaoSell);
        sales.add(strawJuiceSell);
        sales.add(caipSell);

        CashRegister register = new CashRegister();
        String salesPerson = "Simon";
        String dayOfSale = "17-05-2021";
        double sumOfPerson = register.calculateSalesOfPerson(salesPerson,sales);
        System.out.println("Sales of "+ salesPerson +": "+sumOfPerson);
        double sumOfDay = register.calculateSalesPerDay(dayOfSale,sales);
        System.out.println("Sales on "+ dayOfSale +": "+sumOfDay);
        double sumOfPersonPerDay = register.calculateSalesOfPersonPerDay("Simon","17-05-2021",sales);
        System.out.println("Sales of "+ salesPerson +" on "+ dayOfSale +": "+sumOfPersonPerDay);

        double[] sumPerVolume = register.calculateSalesPerVolume(drinks);
        System.out.println("Sales of non alcoholic drinks: "+sumPerVolume[0]);
        System.out.println("Sales of mild alcoholic drinks: "+sumPerVolume[1]);
        System.out.println("Sales of strong alcoholic drinks: "+sumPerVolume[2]);

        
    }
}
