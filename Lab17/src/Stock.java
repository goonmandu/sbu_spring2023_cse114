public class Stock {
    private final String symbol;
    private final String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public double getPreviousClosingPrice() { return previousClosingPrice; }
    public double getCurrentPrice() { return currentPrice; }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double changePercent() { return currentPrice / previousClosingPrice * 100; }
    public static void main(String[] args) {
        var stonks = new Stock[3];
        String[] symbols = {"GOOG", "META", "AMZN"};
        String[] names = {"Alphabet Inc Class C", "Meta Platforms Inc", "Amazon.com, Inc."};
        double[] prev = {1000, 207.84, 102.00};
        double[] curr = {2000, 211.94, 103.29};
        for (int i = 0; i < 3; ++i) {
            stonks[i] = new Stock(symbols[i], names[i]);
            stonks[i].setPreviousClosingPrice(prev[i]);
            stonks[i].setCurrentPrice(curr[i]);
            System.out.printf("%s (%s): %.2f%%\n", stonks[i].getName(), stonks[i].getSymbol(), stonks[i].changePercent());
        }
    }
}
