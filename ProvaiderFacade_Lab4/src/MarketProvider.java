import java.util.*;

class WarehouseId {
    public Warehouse stock;
    public Integer id;

    public WarehouseId(Warehouse stock) {
        this.stock = stock;
        id = stock.name.hashCode() + stock.price.hashCode();
    }
}

public class MarketProvider {
    public HashMap<String, Double> stocks;

    MarketProvider() {
        stocks = new HashMap<>();
        stocks.put("ВМЗ", 6750.432687);
        stocks.put("Газпром", 4897.28753);
        stocks.put("ОМК", 20453.287458);
        stocks.put("СТАН-5000", 1678.1434);
        stocks.put("Роснефть", 798.93);
        stocks.put("Ростех", 234.23);
        stocks.put("Россети", 234.2384);
        stocks.put("Росатом", 2376.238);
    }

    Double getPrice(String name) {
        return stocks.get(name);
    }

    public void onMarketUpdate() {
        double minP = 5, maxP = 10;
        for (Map.Entry<String, Double> entry : stocks.entrySet()) {
            Random rand = new Random();
            double randP = minP + rand.nextDouble() * (maxP - minP);
            double percentMult;
            if (rand.nextBoolean()) {
                percentMult = 1 + randP;
            }
            else {
                percentMult = 1 - randP;
            }
            entry.setValue(entry.getValue() * percentMult);
        }
    }

}
