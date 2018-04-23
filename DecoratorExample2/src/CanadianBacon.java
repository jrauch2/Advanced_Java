public class CanadianBacon extends PizzaDecorator {
    public CanadianBacon(Pizza tempPizza) {
        super(tempPizza);
    }

    public String getToppings() {
        return tempPizza.getToppings() + ", Canadian Bacon";
    }

    public double getPrice() {
        return tempPizza.getPrice() + 1.50;
    }

    @Override
    public String toString() {
        return "Canadian Bacon";
    }
}
