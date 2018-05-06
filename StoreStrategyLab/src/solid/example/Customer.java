package solid.example;

public class Customer {

    private String customerName;
    private Bill bill;

    public Customer(String customerName, double billAmount, DiscountType discountType) {
        this.customerName = customerName;
        bill = new Bill(billAmount, discountType);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return bill.getBillAmount();
    }

    public void setBillAmount(double billAmount) {
        bill.getBillAmount();
    }

    public DiscountType getDiscountType() {
        return bill.getDiscountType();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + bill.getBillAmount() +
                ", discountType=" + bill.getDiscountType() +
                '}';
    }
}
