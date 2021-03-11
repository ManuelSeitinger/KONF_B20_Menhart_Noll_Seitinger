package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Liquid l = new Liquid("Wein", 0.125, 13);
        Liquid gin = new Liquid("Gin",0.4,37);
        Liquid tonicWater = new Liquid("Tonic Water",0.25,0);

        List<Liquid> liquids = new ArrayList<>();
        liquids.add(gin);
        liquids.add(tonicWater);

        System.out.println(l.getName());
        System.out.println(l.getVolume());

        Drink d = new SimpleDrink("Rotwein",l);
        System.out.println(d);

        Drink caipirinha = new Cocktail("Caipirinha",liquids);
        System.out.println(caipirinha);
    }
}
