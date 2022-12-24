import Drinks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractDrink> drinks = new ArrayList<>();

        drinks.add(new CoffeeDrink());
        drinks.add(new CoffeeDrink(standardLiquid.cold_water, Coffee.espresso));
        drinks.add(new CoffeeDrink(standardLiquid.cold_water, Coffee.espressoX2));
        drinks.add(new CoffeeDrink(standardLiquid.milk, Coffee.espresso));
        drinks.add(new TeaDrink());
        drinks.add(new TeaDrink(Tea.green, Condiment.undef, standardLiquid.cold_water));
        drinks.add(new TeaDrink(Tea.black, Condiment.sugar, standardLiquid.alt_milk));
        drinks.add(new TeaDrink(Tea.green, Condiment.sugar, standardLiquid.milk));
        drinks.add(new LemonadeDrink());
        drinks.add(new LemonadeDrink(Fruits.berries));
        drinks.add(new LemonadeDrink(Fruits.banan));

        for (AbstractDrink drink : drinks) {
            System.out.println(drink.getDrink());
        }
    }
}