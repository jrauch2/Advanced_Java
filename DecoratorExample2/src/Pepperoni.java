public class Pepperoni extends PizzaDecorator {

    public Pepperoni(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Pepperoni";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.50;
    }

    @Override
    public String toString() {
        return "Pepperoni";
    }
}
