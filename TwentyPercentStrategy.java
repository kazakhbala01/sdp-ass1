public class TwentyPercentStrategy implements DcountCalculationStrategy{
    public double calculateDcount(double totalBill) {
        return totalBill * 0.2;
    }
}
