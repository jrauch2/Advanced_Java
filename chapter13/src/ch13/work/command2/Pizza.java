package ch13.work.command2;

public class Pizza {

    private String name = "Pepperoni";
    private int quantity = 10;

    public void buy(){
        System.out.println("Pizza [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Pizza [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
