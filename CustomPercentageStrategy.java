public class CustomPercentageStrategy implements DcountCalculationStrategy {
    private String coupon;

    public CustomPercentageStrategy(String coupon) {
        this.coupon = coupon;
    }

    public double calculateDcount(double totalBill) {
        if(coupon.equals("G4Y1337")){
            return totalBill * 0.5;
        }
        else{
            return 0;
        }
    }
}
