package solid.example;

public class Liquidation implements DiscountType {
    double discount;

    public Liquidation() {
        discount = 0.75;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
