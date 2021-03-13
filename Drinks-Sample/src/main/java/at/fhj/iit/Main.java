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

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);

        Drink caipirinha = new Cocktail("Caipirinha",liquids);
        System.out.println(caipirinha);

        Drink strawberryJuice = new FreshJuice("Strawberry", juice);
        System.out.println(strawberryJuice);

        HotDrink cacao = new HotDrink("Cacao", liquidsInHotDrink, 75, powdersInHotDrink);
        cacao.makeHotDrink();
    }
}
