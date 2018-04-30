package work;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        ArrayList<Genre> genres = new ArrayList<>();

        genres.add(bookFactory.getMeal(GenreType.FICTION));
        genres.add(bookFactory.getMeal(GenreType.GRAPHIC_NOVEL));
        genres.add(bookFactory.getMeal(GenreType.BIOGRAPHY));
        genres.add(bookFactory.getMeal(GenreType.FICTION));

        for (Genre m: genres) {
            m.displayBookInfo();
        }
    }
}
