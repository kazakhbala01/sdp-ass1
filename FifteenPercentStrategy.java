public class FifteenPercentStrategy implements DcountCalculationStrategy {
    public double calculateDcount(double totalBill) {
        return totalBill * 0.15;
    }
}
