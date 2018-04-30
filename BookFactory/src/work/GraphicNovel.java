package work;

public class GraphicNovel implements Genre {
    String title;

    public GraphicNovel() {
        title = "Sandman";
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The title is " + title);
    }
}
