package kurs.factory;

public class CoffeeAmericano implements Coffee {
    @Override
    public void makeCoffe() {
        System.out.printf("готовится %s...\n", CoffeeType.AMERICANO);
    }
}
