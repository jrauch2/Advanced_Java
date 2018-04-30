package work;

public class Fiction implements Genre {
    String title;

    public Fiction() {
        title = "Harry Potter";
    }

    @Override
    public void displayBookInfo() {
        System.out.println("THis book is " + title);
    }
}
