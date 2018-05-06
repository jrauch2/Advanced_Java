package solid.example;

public class Bill {

    private double billAmount;
    private DiscountType discountType;

    public Bill( double billAmount, DiscountType discountType){
        setBillAmount(billAmount);
        setDiscountType(discountType);
    }

    public double getBillAmount() {
        return billAmount * (1 - discountType.getDiscount());
    }

    public void setBillAmount(double billAmount) {
        if (billAmount > 0) {
            this.billAmount = billAmount;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public DiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }
}
