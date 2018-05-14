package ch13.work.command2;

public class Main {

    public static void main(String[] args) {
        Pizza abcPizza = new Pizza();

        Order buyStockOrder = new BuyPizza(abcPizza);
        Order sellStockOrder = new SellPizza(abcPizza);

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.takeOrder(buyStockOrder);
        pizzaStore.takeOrder(sellStockOrder);

        pizzaStore.placeOrders();
    }
}