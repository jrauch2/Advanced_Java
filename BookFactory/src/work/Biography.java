package work;

public class Biography implements Genre {
    String title;
    boolean isGood;

    public Biography() {
        title = "A Man Called Cash";
        isGood = true;
    }

    @Override
    public void displayBookInfo() {
        System.out.println(title + " is " + (isGood ?"good":"bad"));
    }
}
