package kurs;

import kurs.factory.*;

public class Main {

    public static void main(String[] args) throws Exception {

        CoffeeHouse coffeeHouse = Context.getInstance().coffeeHouse;

        coffeeHouse.makeCoffee(CoffeeType.ESPRESSO);
        coffeeHouse.makeCoffee(CoffeeType.AMERICANO);
        coffeeHouse.makeCoffee(CoffeeType.CAPPUCCINO);
        coffeeHouse.makeCoffee(CoffeeType.LATTE);

    }
}
