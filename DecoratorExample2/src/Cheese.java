public class Cheese implements Pizza {
    @Override
    public String getToppings() {
        return "Cheese";
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}
