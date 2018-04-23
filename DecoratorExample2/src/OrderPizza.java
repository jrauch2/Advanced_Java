import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderPizza {
    private static Scanner keyboard = new Scanner(System.in);
    private static OrderPizza orderPizza;
    private static int input;
    private static Pizza pizza;

    public static void main(String[] args) {
        orderPizza = new OrderPizza();
        orderPizza.start();
    }

    public static void start() {

        do {
            System.out.println("Would you like to order a pizza?:\n" +
                    "1) Order Pizza\n" +
                    "0) Exit");
            input = keyboard.nextInt();
            keyboard.nextLine();

            if (input == 0) {
                System.exit(0);
            } else if (input == 1) {
                pizza = new Cheese();
                addToppings();
            } else {
                System.out.println("Invalid input. Try again.");
            }
        } while (input != 0);
    }

    public static void addToppings() {

        List<String> toppings = new ArrayList<>();
        toppings.add("1) Pepperoni");
        toppings.add("2) Sausage");
        toppings.add("3) Peppers");
        toppings.add("4) Onions");
        toppings.add("5) Pineapple");
        toppings.add("6) Canadian Bacon");
        while (!toppings.isEmpty()) {
            System.out.println("What toppings would you like to add?");

            for (String line: toppings) {
                System.out.println(line);
            }

            System.out.println("0) Done adding toppings");
            input = keyboard.nextInt();
            keyboard.nextLine();

            if (input == 0) {
                break;
            } else if (input == 1) {
                pizza = new Pepperoni(pizza);
                toppings.remove("1) Pepperoni");
            } else if (input == 2) {
                pizza = new Sausage(pizza);
                toppings.remove("2) Sausage");
            } else if (input == 3) {
                pizza = new Peppers(pizza);
                toppings.remove("3) Peppers");
            } else if (input == 4) {
                pizza = new Onions(pizza);
                toppings.remove("4) Onions");
            } else if (input == 5) {
                pizza = new Pineapple(pizza);
                toppings.remove("5) Pineapple");
            } else if (input == 6) {
                pizza = new CanadianBacon(pizza);
                toppings.remove("6) Canadian Bacon");
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
        System.out.println("Toppings: " + pizza.getToppings());
        System.out.println("Price: $" + pizza.getPrice());
    }
}
