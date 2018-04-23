public class Pineapple extends PizzaDecorator {
    public Pineapple(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Pineapple";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.25;
    }

    @Override
    public String toString() {
        return "Pineapple";
    }
}
