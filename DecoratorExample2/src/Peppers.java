public class Peppers extends PizzaDecorator {
    public Peppers(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Peppers";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.25;
    }

    @Override
    public String toString() {
        return "Peppers";
    }
}
