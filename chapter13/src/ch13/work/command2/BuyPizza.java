package ch13.work.command2;

public class BuyPizza implements Order {
    private Pizza abcPizza;

    public BuyPizza(Pizza abcPizza){
        this.abcPizza = abcPizza;
    }

    public void execute() {
        abcPizza.buy();
    }
}