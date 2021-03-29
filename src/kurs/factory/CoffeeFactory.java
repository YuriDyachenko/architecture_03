package kurs.factory;

public class CoffeeFactory {
    public Coffee createCoffee(CoffeeType coffeeType) throws Exception {
        if (coffeeType == CoffeeType.ESPRESSO) return new CoffeeEspresso();
        if (coffeeType == CoffeeType.AMERICANO) return new CoffeeAmericano();
        if (coffeeType == CoffeeType.LATTE) return new CoffeeLatte();
        if (coffeeType == CoffeeType.CAPPUCCINO) return new CoffeeCappuccino();
        throw new Exception("Неизвестный вид кофе!");
    }
}
