public class Sausage extends PizzaDecorator {
    public Sausage(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Sausage";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.50;
    }

    @Override
    public String toString() {
        return "Sausage";
    }
}
