package Drinks;

public abstract class AbstractDrink {
    protected String drink_;
    protected standardLiquid standardLiquid_;

    public String getDrink() {
        return drink_;
    }
    public standardLiquid getStandardLiquid() {
        return standardLiquid_;
    }

    public void setStandardLiquid(standardLiquid standardLiquid) {
        standardLiquid_ = standardLiquid;
        evaluateDrink();
    }


    protected abstract void evaluateDrink();
}