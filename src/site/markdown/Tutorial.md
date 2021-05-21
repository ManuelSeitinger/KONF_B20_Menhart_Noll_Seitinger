# Tutorial

After having successfully installed this repository from github, give it a go
and try some drinks...
Since a drink is quite something abstract and conists of actual liquids, we have to 
get those first by using

```` java
Liquid tonicWater = new Liquid("Tonic Water",0.25,0); 
Liquid juice = new Liquid("Juice", 0.25, 0);
Liquid milk = new Liquid("Milk", 0.125, 0);
````  

or alike.

Want to mix it and have a heart-warming cacao or a funky gin tonic?

```` java
 List<Liquid> liquids = new ArrayList<>();
        liquids.add(gin);
        liquids.add(tonicWater);

        List<Liquid> liquidsInHotDrink = new ArrayList<>();
        liquidsInHotDrink.add(milk);
        liquidsInHotDrink.add(caramel);

        List<Powder> powdersInHotDrink = new ArrayList<>();
        powdersInHotDrink.add(cacaoPowder);
````

Already done? So we have to pay and do some calculations ...

```` java
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
````

Any questions? Go ahead and [ask me](https://www.youtube.com/watch?v=RRubcjpTkks)
