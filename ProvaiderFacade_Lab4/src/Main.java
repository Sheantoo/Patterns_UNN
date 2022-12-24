public class Main {
    public static void main(String[] args) {
        TradingRobot tR = new TradingRobot(new MarketProvider());
        int b1 = tR.buyStock("ВМЗ" , 6750.432687, 1);
        int b2 = tR.buyStock("ЛПК" , 4897.28753, 1);
        int b3 = tR.buyStock("ОМК" , 20453.287458, 1);
        int s1 = tR.saleStock("СТАН-5000" , 1678.1434, 1);
        tR.cancelOrder(b2);
    }
}