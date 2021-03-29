package kurs.factory;

public class CoffeeLatte implements Coffee {
    @Override
    public void makeCoffe() {
        System.out.printf("готовится %s...\n", CoffeeType.LATTE);
    }
}
