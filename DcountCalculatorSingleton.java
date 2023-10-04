public class DcountCalculatorSingleton {
    private static DcountCalculatorSingleton instance = null;
    private double totalBill;
    private DcountCalculationStrategy strategy;

    private DcountCalculatorSingleton() {
    }

    public static DcountCalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new DcountCalculatorSingleton();
        }
        return instance;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public void setDcountStrategy(DcountCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDcount() {
        if (strategy == null) {
            return strategy.calculateDcount(totalBill);
        }
        return strategy.calculateDcount(totalBill);
    }
}