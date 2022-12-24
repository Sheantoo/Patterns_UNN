import java.util.*;

public class TradingProvider {
    static int opId = 0;
    MarketProvider mProvider;
    HashMap<Warehouse, Integer> availableWarehouses;
    HashMap<Warehouse, Integer> realizedStocks;

    TradingProvider(MarketProvider marketProvider) {
        mProvider = marketProvider;
        availableWarehouses = new HashMap<>();
        realizedStocks = new HashMap<>();

        availableWarehouses.put(new Warehouse("ВМЗ" , 6750.432687), -1);
        availableWarehouses.put(new Warehouse("ЛПК" , 4897.28753), -1);
        availableWarehouses.put(new Warehouse("ОМК" , 20453.287458), -1);
        availableWarehouses.put(new Warehouse("СТАН-5000" , 1678.1434), -1);
    }
    public int sendOrder(String symbol, Double price, int volume, TradingOperation op) {
        opId++;
        mProvider.onMarketUpdate();
        if (op == TradingOperation.sale) {
            for (int i = 0; i < volume; i++) {
                Warehouse stock = new Warehouse(symbol, price);
                availableWarehouses.put(stock, opId);
            }
            System.out.println("Successful sale " + volume + " warehouse with name: " + symbol + "with price: " + price);
        }
        else {
            List<Warehouse> toRemove = new ArrayList<>(volume);
            for (int i = 0; i < volume; i++) {
                for (Map.Entry<Warehouse, Integer> entry : availableWarehouses.entrySet()) {
                    if (Objects.equals(entry.getKey().name, symbol) && Objects.equals(entry.getKey().price, price)) {
                        toRemove.add(entry.getKey());
                    }
                }
            }
            for (Warehouse stockToRemove : toRemove) {
                realizedStocks.put(stockToRemove, opId);
                availableWarehouses.remove(stockToRemove);
            }
            System.out.println("Successful purchase " + volume + " warehouses with name: " + symbol + "with price: " + price);
        }
        return opId;
    }

    public void cancelOrder(Integer id) {
        if (id < 0) {
            System.out.println("Invalid id");
            return;
        }
        opId++;
        List<Warehouse> toReturn = new ArrayList<>();
        for (Map.Entry<Warehouse, Integer> entry : realizedStocks.entrySet()) {
            if (entry.getValue() == id) {
                toReturn.add(entry.getKey());
            }
        }

        if (toReturn.size() == 0) {
            System.out.println("No such id");
        }
        for (Warehouse stockToReturn : toReturn) {
            availableWarehouses.put(stockToReturn, opId);
            realizedStocks.remove(stockToReturn);
            System.out.println("Successful refund warehouse with name " + stockToReturn.name + "with price " + stockToReturn.price);
        }
    }
}
