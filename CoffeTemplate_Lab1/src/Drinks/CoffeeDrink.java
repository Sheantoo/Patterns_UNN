package Drinks;

public class CoffeeDrink extends AbstractDrink {
    protected Coffee coffee_;

    protected void evaluateDrink() {
        if (standardLiquid_ == standardLiquid.none && coffee_ == Coffee.none) {
            drink_ = "Espresso";
        }
        else if (standardLiquid_ == standardLiquid.none && coffee_ == Coffee.espressoX2) {
            drink_ = "2x-Espresso";
        }
        else if (standardLiquid_ == standardLiquid.cold_water && coffee_ == Coffee.espresso) {
            drink_ = "Watered Espresso";
        }
        else if (standardLiquid_ == standardLiquid.cold_water && coffee_ == Coffee.espressoX2) {
            drink_ = "Americano";
        }
        else if (standardLiquid_ == standardLiquid.milk && coffee_ == Coffee.espresso) {
            drink_ = "Cappuccino";
        }
        else if (standardLiquid_ == standardLiquid.milk && coffee_ == Coffee.espressoX2) {
            drink_ = "Flat White";
        }
        else if (standardLiquid_ == standardLiquid.alt_milk && coffee_ == Coffee.espresso) {
            drink_ = "Banana Cappuccino";
        }
        else if (standardLiquid_ == standardLiquid.alt_milk && coffee_ == Coffee.espressoX2) {
            drink_ = "Banana Flat White";
        }
        else {
            drink_ = "none";
        }
    }

    public CoffeeDrink() {
        this(standardLiquid.none, Coffee.none);
    }
    public CoffeeDrink(standardLiquid standardLiquid, Coffee coffee) {
        standardLiquid_ = standardLiquid;
        coffee_ = coffee;

        evaluateDrink();
    }

    public Coffee getCoffee() {
        return coffee_;
    }

    public void setCoffee(Coffee coffee) {
        coffee_ = coffee;
        evaluateDrink();
    }
}