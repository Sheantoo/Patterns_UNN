package Drinks;

public class TeaDrink extends AbstractDrink {
    private Tea tea_;
    private Condiment condiment_;
    private standardLiquid dilution_;

    public TeaDrink() {
        this(Tea.black, Condiment.undef, standardLiquid.none);
    }
    public TeaDrink(Tea tea, Condiment condiment, standardLiquid dilution) {
        standardLiquid_ = standardLiquid.cold_water;
        tea_ = tea;
        condiment_ = condiment;
        dilution_ = dilution;

        evaluateDrink();
    }

    @Override
    protected void evaluateDrink() {
        if (tea_ == Tea.green && condiment_ == Condiment.undef && dilution_== standardLiquid.none) {
            drink_ = "Green";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.undef && dilution_== standardLiquid.cold_water) {
            drink_ = "Cold Green";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.undef && dilution_== standardLiquid.milk) {
            drink_ = "Milk Green";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.undef && dilution_== standardLiquid.alt_milk) {
            drink_ = "Alternative milk Green";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.sugar && dilution_== standardLiquid.none) {
            drink_ = "Green with sugar";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.sugar && dilution_== standardLiquid.cold_water) {
            drink_ = "Cold Green with sugar";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.sugar && dilution_== standardLiquid.milk) {
            drink_ = "Milk Green with sugar";
        }
        else if (tea_ == Tea.green && condiment_ == Condiment.sugar && dilution_== standardLiquid.alt_milk) {
            drink_ = "Alternative milk Green with sugar";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.undef && dilution_== standardLiquid.none) {
            drink_ = "Black tea";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.undef && dilution_== standardLiquid.cold_water) {
            drink_ = "Cold black tea";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.undef && dilution_== standardLiquid.milk) {
            drink_ = "Milk black tea";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.undef && dilution_== standardLiquid.alt_milk) {
            drink_ = "Alternative milk black tea";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.sugar && dilution_== standardLiquid.none) {
            drink_ = "Black tea with sugar";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.sugar && dilution_== standardLiquid.cold_water) {
            drink_ = "Cold black tea with sugar";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.sugar && dilution_== standardLiquid.milk) {
            drink_ = "Milk black tea with sugar";
        }
        else if (tea_ == Tea.black && condiment_ == Condiment.sugar && dilution_== standardLiquid.alt_milk) {
            drink_ = "Alternative milk black tea with sugar";
        }
        else {
            drink_ = "none";
        }
    }
}
