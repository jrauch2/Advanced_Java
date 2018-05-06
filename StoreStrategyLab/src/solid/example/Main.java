package solid.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new Customer("William Walters", 75.34, new Discount()));
        orders.add(new Customer("Susan Smothers", 24.12, new Sale()));
        orders.add(new Customer("Jessica Johnson", 273.93, new Liquidation()));
        orders.add(new Customer("Richard Ricardo", 171.42, new Discount()));

        double total=0;
        for(Customer o: orders) {
            System.out.printf("%s %.2f %n", o.getCustomerName(), o.getBillAmount());
            total+= o.getBillAmount();
        }
        System.out.printf("Total:    %.2f", total);

    }
}
