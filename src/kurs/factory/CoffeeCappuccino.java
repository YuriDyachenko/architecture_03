package kurs.factory;

public class CoffeeCappuccino implements Coffee {
    @Override
    public void makeCoffe() {
        System.out.printf("готовится %s...\n", CoffeeType.CAPPUCCINO);
    }
}
