package kurs;

import kurs.factory.*;

public class Context {
    private static Context context = null;
    public final CoffeeHouse coffeeHouse;

    private Context() {
        coffeeHouse = new CoffeeHouse(new CoffeeFactory());
    }

    public static Context getInstance() {
        if (context == null) context = new Context();
        return context;
    }
}
