package kurs.factory;

public enum CoffeeType {
    ESPRESSO ("АМЕРИКАНО"),
    AMERICANO ("АМЕРИКАНО"),
    LATTE ("АМЕРИКАНО"),
    CAPPUCCINO ("АМЕРИКАНО");

    private String name;

    CoffeeType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
