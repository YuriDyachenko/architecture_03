package kurs.factory;

public class CoffeeHouse {
    private final CoffeeFactory coffeeFactory;

    public CoffeeHouse(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee makeCoffee(CoffeeType coffeeType) throws Exception {
        System.out.printf("получен заказ на %s\n", coffeeType);
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);
        coffee.makeCoffe();
        System.out.printf("готов %s\n", coffeeType);
        return coffee;
    }
}
