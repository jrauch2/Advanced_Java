public class Onions extends PizzaDecorator {
    public Onions(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Onions";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.25;
    }

    @Override
    public String toString() {
        return "Onions";
    }
}
