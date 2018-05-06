package solid.example;

public class Discount implements DiscountType {
    double discount;

    public Discount() {
        discount = 0.5;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
