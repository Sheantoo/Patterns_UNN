public class TradingRobot {
    MarketProvider mProvider;
    TradingProvider tProvider;

    TradingRobot(MarketProvider marketProvider) {
        mProvider = marketProvider;
        tProvider = new TradingProvider(marketProvider);
    }
    public int buyStock(String name, Double price, Integer volume) {
        return tProvider.sendOrder(name, price, volume, TradingOperation.buy);
    }

    public int saleStock(String name, Double price, Integer volume) {
        return tProvider.sendOrder(name, price, volume, TradingOperation.sale);
    }

    public void cancelOrder(Integer id) {
        tProvider.cancelOrder(id);
    }

}
