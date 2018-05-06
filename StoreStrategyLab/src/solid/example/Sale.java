package solid.example;

public class Sale implements DiscountType{
    double discount;

    public Sale() {
        discount = 0.1;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
