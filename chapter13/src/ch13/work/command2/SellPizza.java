package ch13.work.command2;

public class SellPizza implements Order {
    private Pizza abcPizza;

    public SellPizza(Pizza abcPizza){
        this.abcPizza = abcPizza;
    }

    public void execute() {
        abcPizza.sell();
    }
}
