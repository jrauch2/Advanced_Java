public abstract class PizzaDecorator implements Pizza {

    protected Pizza tempPizza;

    public PizzaDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    public String getToppings() {
        return tempPizza.getToppings();
    }

    public double getPrice() {
        return tempPizza.getPrice();
    }
}
