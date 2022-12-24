package Drinks;

public class LemonadeDrink extends AbstractDrink {
    private Fruits fruits_;

    public LemonadeDrink() {
        this(Fruits.lemon);
    }
    public LemonadeDrink(Fruits fruits) {
        standardLiquid_ = standardLiquid.cold_water;
        fruits_ = fruits;

        evaluateDrink();
    }

    @Override
    protected void evaluateDrink() {
        switch (fruits_) {
            case berries -> drink_ = "Berry lemonade";
            case lemon -> drink_ = "Lemonade";
            case apple -> drink_ = "Apple lemonade";
            case banan -> drink_ = "Banan lemonade";
        }
    }

    public Fruits getFruits() {
        return fruits_;
    }

    public void setFruits(Fruits fruits) {
        fruits_ = fruits;
        evaluateDrink();
    }
}

