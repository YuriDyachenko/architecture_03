package kurs.factory;

public class CoffeeEspresso implements Coffee {
    @Override
    public void makeCoffe() {
        System.out.printf("готовится %s...\n", CoffeeType.ESPRESSO);
    }
}
